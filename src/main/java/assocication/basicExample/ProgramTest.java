package assocication.basicExample;

public class ProgramTest {
    public static void main(String[] args) {
        ChatRoom telegramChatRoom = new ChatRoom();
        telegramChatRoom.name = "Extreme Code Room";

        System.out.println(telegramChatRoom.name);

        User user = new User();
        user.room = telegramChatRoom;
        System.out.println(user.room);
    }
}
