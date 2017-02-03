package New;

import java.awt.Frame;
import java.awt.LayoutManager;

public class Multiplication_Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int x=1; x<13; x++ ) {
			for (int y=1; y<13; y++) {
				int y2= x*y;
				/*Frame frame = new Frame();
				frame.setBounds(13, 13, 13, 13);
				frame.show();
				int size [] [] =
					{{4, 4, 4, 4},
					{13, TableLayout.FILL,12,12,12}};
				frame.setLayout(new TableLayout(12,12,12,12));
			    */
								System.out.printf("%4d", y2);
				
			}
			System.out.println();
	
		}
		
		
		
		
		
		
	}
}
