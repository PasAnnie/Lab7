   class People{
        String name, lastname;
        int age;
        void getInfo(){
            System.out.println("Я " + this.lastname +" " + this.name +". Мне " + this.age +" ");
        }
        void walk(){
            System.out.println("walk");
        }
        void voice(){
            System.out.println("voice");
        }
        void run(){
            System.out.println("run");
        }
        People(){
            name= "Default";
            lastname = "Default";
            age = 0;
        }
        People(String name, String lastname, int age ){
            this.age=age;
            this.lastname=lastname;
            this.name=name;
        }
    }
    class Student extends People{
        Student(String name, String lastname, int age ){
            super(name, lastname,age);
        }
        void learn(){
            System.out.println("learn");
        }
    }

    class Teacher extends People{
        Teacher(String name, String lastname, int age ){
            super(name, lastname,age);
        }
        void teach(){
            System.out.println("teach");
        }
    }

    public class Lab8PAS {
        public static void main(String[] args) {
            People god = new People();
            god.getInfo();
            god.run();
            god.voice();
            god.walk();
            System.out.println();
            People Anya = new People("Anya","Pavlova",20 );
            Anya.getInfo();
            Anya.run();
            Anya.voice();
            Anya.walk();
            System.out.println();
            Student Pomidor = new Student("Pomidor","Pomidorov",2);
            Pomidor.getInfo();
            Pomidor.run();
            Pomidor.voice();
            Pomidor.walk();
            Pomidor.learn();
            System.out.println();
            Teacher Tomat = new Teacher("Tomat","Tomatov",10);
            Tomat.getInfo();
            Tomat.run();
            Tomat.voice();
            Tomat.walk();
            Tomat.teach();
            System.out.println();
        }
    }

