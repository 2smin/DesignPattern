package _1_creational_pattern.ProtoTypePattern.Sample2;

public class Message implements Cloneable {

    private String header;
    private String body;
    private File file;

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
       File file = new File();
       file.setFileContent(this.file.getFileContent());

       Message message = new Message();
       message.setHeader(this.getHeader());
       message.setBody(this.getBody());
       message.setFile(file);

       return message;
    }

    public String getHeader() {
        return header;
    }

    public String getBody() {
        return body;
    }
}
