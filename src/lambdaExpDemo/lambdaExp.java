package lambdaExpDemo;// now in functional interfaces what if we don't want to create a class that implements that interface

// first way (by creating the implement class):

// create an interface with ONLY ONE abstract method as its functional interface :


interface funcInter{
    void show();
}


// class func implements funcInter{
//    public void show(){
//        System.out.println("In show");
//    }
//        }





// read this after completing everything for the upper case:

// now what if we have a method in the functional interface which accepts some variable :

interface hell{
    void hella(int i);
}


// now what if you have a method in the interface in which you have to return something:

interface thor{
   int hammer(int i, int j);
}


public class lambdaExp {
    public static void main(String[] args) {
      // first method (when we have an implement class (have noting to do with lambda expression):
//
//        funcInter inter = new func();
//        inter.show();




        // second method(defining the only abstract function present in the functional interface in anonymous way,directly inside the main method when we call it):

//        funcInter inter = new funcInter()
//        {
//            public void show(){
//                System.out.println("in show");
//            };
//        };
//        inter.show();





        // third method (using LAMBDA EXPRESSION):


        // Lambda expression can be used to decrease the coding lines :

//        funcInter inter = () -> {
//                System.out.println("in show");
//        };      // now we do not have to instantiate it with the class name we just need to use the brackets and then within the curly braces define the working of the method



        // lambda expression for interface hell:

//        // option 1: (reduced curly braces, added the value to the output)
//        hell hola = (int i) -> System.out.println("Hola mf " + i);
//        hola.hella(7);
//
//        // option 2: (reduced variable type (already defined in the functional interface):
//
//        hell hola = (i) -> System.out.println("Hola mf " + i);
//        hola.hella(8);
//


//        // option 3: (reduced variable brackets):
//
//        hell hola = i -> System.out.println("Hola mf " + i);
//        hola.hella(9);


//        // lambda expression for return statements:
//        thor thunder = (i,j) -> i + j;
//        int result = thunder.hammer(7,8);
//        System.out.println(result);



    }



}
