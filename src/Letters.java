import java.util.*;
import java.lang.*;

public class Letters {

    public static void main(String[] args) {

        /*//ArrayList
        ArrayList<String> nameLetters = new ArrayList<>();
        nameLetters.add("5");
        nameLetters.add("A");
        nameLetters.add("N");
        nameLetters.add("C");
        nameLetters.add("A");
        nameLetters.add("3");
        nameLetters.add("1");
        nameLetters.add("5");

        for (String g : nameLetters) {

            if (g.equals("A") || g.equals("E") || g.equals("I") || g.equals("O") || g.equals("U")) {
                System.out.println("VOCAL");
            } else if ((g.compareTo("0") >=0)  && (g.compareTo("9")<= 0)) {
                System.out.println("Els noms de persones no contenen números!");
            }
           *//* } else if (g.equals("0") || g.equals("1") || g.equals("2") || g.equals("3") || g.equals("4") ||g.equals("5") || g.equals("6") || g.equals("7") || g.equals("8") || g.equals("9")) {
                System.out.println("Els noms de persones no contenen números!");
            }*//* else {
                System.out.println("CONSONANT");
            }
        }
    }
}
*/

/*
        LinkedList<String> nombreLetras=new LinkedList<>();
        nombreLetras.add("A");
        nombreLetras.add("N");
        nombreLetras.add("C");
        nombreLetras.add("A");

        LinkedList<String> apellidoLetras=new LinkedList<>();
        apellidoLetras.add("M");
        apellidoLetras.add("U");
        apellidoLetras.add("N");
        apellidoLetras.add("T");
        apellidoLetras.add("E");
        apellidoLetras.add("A");
        apellidoLetras.add("N");
        apellidoLetras.add("U");

        //System.out.println(nombreLetras);

       // System.out.println(apellidoLetras);

        List<String> junto=new LinkedList<>();
        junto.addAll(nombreLetras);
        junto.add(" ");
        junto.addAll(apellidoLetras);
        System.out.println("Fullname: " + junto);

        //System.out.println("FullName: "+ nombreLetras +" "+ apellidoLetras);
    }
}
*/






        //Map
        HashMap<String, Integer> nameLetters=new HashMap<>();
        ArrayList<String> nameLetters2 = new ArrayList<>();
        
        nameLetters2.add("A");
        nameLetters2.add("N");
        nameLetters2.add("C");
        nameLetters2.add("A");

        for (:
             ) {
            
        }

        System.out.println(nameLetters.size());

        System.out.println(nameLetters);

        //nos imprime un set
        System.out.println(nameLetters.entrySet());

        for(Map.Entry<String, Integer> m: nameLetters.entrySet()){

            Integer key=m.getKey();

            String value=m.getValue();

            System.out.println(key + " " + value);

        }

    }

}









        //Array of my name
      /*  String[] name;

        name = new String[4];
        name[0]= "A";
        name[1]= "N";
        name[2]= "C";
        name[3]= "A";

        for (String a: name) {
            System.out.print(a);
        }
    }

}
*/