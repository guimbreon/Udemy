public class Coding_Exercise31 {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        if(age < 0){
            this.age = 0;
        } else if (age > 100) {
            this.age = 0;
        } else{
        this.age = age;}
    }


    public boolean isTeen(){
        if(this.age > 12 && this.age < 20){
            return true;
        }
        return false;
    }

    public String getFullName(){
        if (this.firstName.isEmpty() && this.lastName.isEmpty()){
            return "";
        } else if (this.firstName.isEmpty()) {
            return lastName;
        } else if (this.lastName.isEmpty()) {
            return this.firstName;
        }else{
            return this.firstName + " " + this.lastName;
        }
    }
}