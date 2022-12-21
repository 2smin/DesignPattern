package _1_creational_pattern.ProtoTypePattern.Sample2;

public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        File file = new File();
        file.setFileContent("file content");

        Message message = new Message();
        message.setHeader("header msg");
        message.setBody("body msg");
        message.setFile(file);

        Message clonedMessage = (Message) message.clone();

        System.out.println(message == clonedMessage);
        System.out.println(message.getHeader().equals(clonedMessage.getHeader()));
        System.out.println(message.getFile() == clonedMessage.getFile());
    }


}
