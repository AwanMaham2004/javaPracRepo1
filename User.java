public class User {
    private String name;
    private int age;
    private String gender;

    User (String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void userDetails(){
        if (gender.equalsIgnoreCase("Female")){
            System.out.println("Mrs. " + name);
            System.out.println("Age:                    " + age);
            System.out.println("Gender:                 " + gender);
        }
        else {
            System.out.println("Mr. " + name);
            System.out.println("Age:                    " + age);
            System.out.println("Gender:                 " + gender);
        }
    }
}

