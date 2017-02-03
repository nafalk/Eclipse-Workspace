package Hail_Hitler;


public class Player {

	//Adds the item to your inventory.
	public void addItemToInv(String name){

		for(int i = 0; i < inv.length; i++){
			if(inv[i] == ""){
				inv[i] = name;

				System.out.println("You have added: " + name + ".");
				return;
			}
		}
		System.out.println("You have know room in your inventory.");
	}

	//Prints the inventory.
	public void printInv(){
		for(String x: inv){
			System.out.println(x);
		}
	}

	//Removes a item from your inventory.
	public void removeItemFromInv(String name){
		for(int i = 0; i < inv.length; i++){
			if(inv[i].equals(name)){
				inv[i] = "";
			}
		}
		System.out.println("That item is not in your inventory.");
	}

	private final String inv[] = {"","","","",""};

}

