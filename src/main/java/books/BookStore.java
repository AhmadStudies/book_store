package books;

public class BookStore {
    String name;
    Staff staff;

    public BookStore(Staff staff){
        this.staff = staff;
    }
    public void pring(){
        System.out.println("staf: " + staff.getName());
    }

}
