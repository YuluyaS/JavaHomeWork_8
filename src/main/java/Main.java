public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Иван";
        post.Passport = "4444 № 44444444";
        post.Patronymic = "Иванович";
        post.Phone = "+7 (999)-999-99-99";
        post.Surname = "Иванов";
        post.Subscription = true;


        post.birthday = new FormDate();
        post.birthday.day = 13;
        post.birthday.month = 6;
        post.birthday.year = 1999;


        System.out.println(post.name);
        System.out.println(post.birthday);
    }
}
