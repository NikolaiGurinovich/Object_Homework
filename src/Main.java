public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        User user1 = new User(23,"Stas", new Identification(1234556789));
        User user2 = new User(23,"Stas", new Identification(1234556789));
        System.out.println(user1.equals(user2));
        User userLightClone = (User) user1.clone("lightclone");
        System.out.println(userLightClone);
        user1.identification.setId(1);
        System.out.println(userLightClone);
        User userDeepClone = (User) user2.clone("deepclone");
        System.out.println(userDeepClone);
        user2.identification.setId(1);
        System.out.println(userDeepClone);
    }
}