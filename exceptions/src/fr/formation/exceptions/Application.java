package fr.formation.exceptions;

public class Application {

    public static void main(String[] args) {
	String[] values = null;
	int index = 0;
	System.out.println("result=" + getValueAt(values, index));
    }

    private static String getValueAt(String[] values, int index) {
	// Appeler handleExceptions et g�rer la checked exception
	// "MyFirstCheckedException" pour lever une unchecked � la place
	return null;
    }

    private static String handleExceptions(String[] values, int index)
	    throws MyFirstCheckedException {
	// G�rer les 2 checked exceptions possibles:
	// Cas values est null
	// Cas index n'est pas un index existant
	// Si une des deux exceptions, pr�ciser un message sur l'origine du
	// probl�me:
	// values is null dans le 1er cas
	// l'index n'exsite pas dans values
	// Si tout est bon un r�sultat est retourn�
	return values[index];
    }
}
