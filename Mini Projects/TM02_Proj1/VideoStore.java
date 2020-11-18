
public class VideoStore {
	Video[] store;
	public int storeSize;
	Video video;
	
	public int checkVideo(String name) {
		int flag=0;
			for(Video video:store) {
				if(video.getName().equals(name)) {
					 flag=1;
					 return flag;
				}
			}
		return flag;
	}
	
	public void addVideo(String name) {
		video =new Video(name);
		try {
			storeSize=store.length;
		}catch(Exception e) {
			storeSize=0;
		}
		Video[] videoArr=new Video[storeSize+1];
		videoArr[storeSize]= video;
		store=videoArr;
		System.out.println("StoreSize:"+store.length);
		//storeSize++;
	}
	public void  doCheckout(String name) {
		if(store==null|| store.length==0) {
			System.out.println("No video available.");
			return;
		}
		for(Video video:store) {
			if(video.getName().equals(name)) {
				video.doCheckout();
			}
		}
		
	}
	public void doReturn(String name) {
		if(store==null|| store.length==0) {
			System.out.println("No video available for return.");
			return;
		}
		for(Video video:store) {
			if(video.getName().equals(name)) {
				video.doReturn();
			}
		}
		
	}
	public void receiveRating(String name, int rating) {
		if(store==null|| store.length==0) {
			System.out.println("No video available to receive rating.");
			return;
		}
		for(Video video:store) {
			if(video.getName().equals(name)) {
				video.receiveRating(rating);
			}
		}
		
	}
	public void listInventory() {
		if(store==null|| store.length==0) {
			System.out.println("No video available in store.");
			return;
		}
		for(int i=0;i<45;i++) {
			System.out.print("=");
		}
		System.out.println("");
		System.out.println("Video Name\t|Checkout  \t|Rating    \t");
		for(int i=0;i<store.length;i++) {
			System.out.printf("%-10s\t|%-10s\t|%-10s",store[i].getName(),store[i].getCheckout(),store[i].getRating());
			System.out.println("");
		}
		/*for(Video video:store) {
			System.out.printf("%-10s\t|%-10s\t|%-10s",video.getName(),video.getCheckout(),video.getRating());
			System.out.println("");
		}*/
		for(int i=0;i<45;i++)
		{
			System.out.print("=");
		}
		System.out.println();

		
	}
}
