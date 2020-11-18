import java.util.Scanner;
import java.io.InputStreamReader;

public class VideoLaucher {
	public static void main(String[] args) {
		Scanner input=new Scanner(new InputStreamReader(System.in));
		VideoStore vs=new VideoStore();
		int choice;
		do {
			System.out.println("");
			System.out.println("MAIN MENU");
			System.out.println("=========");
			System.out.println("1.Add Videos :");
			System.out.println("2.Check Out Video :");
			System.out.println("3.Return Video :");
			System.out.println("4.Receive Rating :");
			System.out.println("5.List Inventory");
			System.out.println("6.Exit :");
			System.out.print("Enter your choice(1..6) :");
			
			choice=input.nextInt();
			String str;
			int rate;
			
			switch(choice) {
			case 1:
				System.out.print("Enter the name of video you want to add: ");
				str=input.next();
				vs.addVideo(str);
				System.out.println("Video \""+str+"\" added successfully.");
				break;
				
			case 2:
				System.out.print("Enter the name of the video you want to checkout: ");
				str=input.next();
				if(vs.checkVideo(str)==0) {
					System.out.println("Video does not exist.");
					break;
				}else {
					vs.doCheckout(str);
					System.out.println("Video \""+str+"\" checked out successfully.");
					break;
				}
				
			case 3:
				System.out.print("Enter the name of the video you want to return: ");
				str=input.next();
				if(vs.checkVideo(str)==0) {
					System.out.println("Video does not exist.");
					break;
				}else {
					vs.doReturn(str);
					System.out.println("Video \""+str+"\" returned successfully.");
					break;
				}
				
			case 4:
				System.out.print("Enter the name of the video you want to rate: ");
				str=input.next();
				if(vs.checkVideo(str)==0) {
					System.out.println("Video does not exist.");
					break;
				}else {
					System.out.print("Enter the rating for this video:");
					rate=input.nextInt();
					vs.receiveRating(str, rate);
					System.out.println("Rating \""+rate+"\" has been mapped to \""+str+"\".");
					break;
				}
				
			case 5:
				vs.listInventory();
				break;
			case 6:
				System.out.println("Exiting...! Thanks for using the application.");
				break;
				
			}
		}while(choice!=6);
		input.close();
	}

}
