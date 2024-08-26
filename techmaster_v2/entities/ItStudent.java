package techmaster_v2.entities;

public class ItStudent extends TechmasterStudent {
    private static int autoId;
    private int id;
    private double html;
    private double css;
    private double java;

    public double getHtml() {
        return html;
    }

    public void setHtml(double html) {
        this.html = html;
    }

    public double getCss() {
        return css;
    }

    public void setCss(double css) {
        this.css = css;
    }

    public double getJava() {
        return java;
    }

    public void setJava(double java) {
        this.java = java;
    }

    public ItStudent(String fullName, String major, double html, double css, double java) {
        super(fullName, major);
        this.id = ++autoId;
        this.html = html;
        this.css = css;
        this.java = java;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("Id: " + id);
        System.out.println("HTML: " + html);
        System.out.println("CSS: " + css);
        System.out.println("Java: " + java);
    }

    @Override
    public double getPoint() {
        return (java*2 + html + css)/4;
    }

    @Override
    public String toString() {
        return
                "ItStudent" +
                        "Id: " + id +
                "html=" + html + "\n" +
                ", css=" + css + "\n" +
                ", java=" + java;
    }
}


