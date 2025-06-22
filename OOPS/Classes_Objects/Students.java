class Students {
    int id;
    String name;

    static int count = 0;

   

    Students(){
        this(100, "Unknown");
        System.out.println("Deafualt Constructor");
    }

    Students(int id, String name){
        // this();
        count++;
        this.id = id;
        this.name = name;
    }


    void show(Students std){
       
        System.out.println(std.name);
        System.out.println(std.id);
    }

    void display(){
        show(this);
    }

}



class Mains{

    public static void main(String[] args) {
      //  Students student3 = new Students();

        System.out.println(Students.count);

        System.out.println(Students.count);


     //   double pi = Math.PI;
        
    }
}
