package a0113.book;

public class Ebook extends Book{
    private double fileSize; //파일의 크기 메가바이트
    private String format; //파일 형식

    public Ebook(String title, String author, String iSBN, double fileSize, String format) {
        super(title, author, iSBN);
        this.fileSize = fileSize;
        this.format = format;
    }

    public double getFileSize() {
        return fileSize;
    }

    public void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("file Size: " +fileSize + "MB");
        System.out.println("Format: " +format);
    }

    
    
}
