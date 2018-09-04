import java.util.*;
import java.lang.*;

public class Letters {
    public static void main(String[] args) {

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





/*
        //Map
        HashMap<Integer, String> nameLetters=new HashMap<Integer, String>();
        nameLetters.put(1, "A");
        nameLetters.put(2, "N");
        nameLetters.put(3, "C");
        nameLetters.put(4, "A");

        System.out.println(nameLetters.size());

        System.out.println(nameLetters);

        //nos imprime un set
        System.out.println(nameLetters.entrySet());

        for(Map.Entry<Integer, String> m: nameLetters.entrySet()){

            Integer key=m.getKey();

            String value=m.getValue();

            System.out.println(key + " " + value);

        }

    }

}
*/



          //ArrayList
        ArrayList<String> nameLetters = new ArrayList<>();
        nameLetters.add("A");
        nameLetters.add("N");
        nameLetters.add("C");
        nameLetters.add("A");



        for (String g : nameLetters) {

            if (g == "A" || g=="E" || g=="I" || g=="O" || g=="U") {
                System.out.println("VOCAL");
            } else {
                System.out.println("CONSONANT");


            }
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