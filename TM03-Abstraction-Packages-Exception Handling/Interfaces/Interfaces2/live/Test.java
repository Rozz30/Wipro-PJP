package live;
import music.*; // * includes everything in that directory (class & interface files) but not sub-directories
import music.string.Veena;
import music.wind.Saxophone;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Veena v = new Veena();
		Saxophone s = new Saxophone();
		v.play();
		s.play();
		
		Playable pv = new Veena();
		Playable ps = new Saxophone();
		pv.play();
		ps.play();
	}

}
