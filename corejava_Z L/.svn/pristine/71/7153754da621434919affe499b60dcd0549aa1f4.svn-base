package com.nivket.lab1helloworld.print;

class Book  //书类
{
    // 定义书的属性
    private String ID;    // 书编号
    private String name;  // 书名
    private String author;// 作者
    private double price; // 价格
    private String press; // 出版社
    private String kin;  // 类别；

    // 无参构造函数
    public Book(){}
    // 有参构造
    public Book(String ID, String name, String author, double price, String press, String kin )
    {
        this.ID = ID;
        this.name = name;
        this.author = author;
        this.price = price;
        this.press = press;
        this.kin = kin;
    }
    // ID的setter、gettter方法
    public void setID(String ID)
    {
        this.ID = ID;
    }
    public String getID()
    {
        return this.ID;
    }
    // 书名name的setter、gettter方法
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return this.name;
    }
    // 作者author的setter、gettter方法
    public void setAuthor(String author)
    {
        this.author = author;
    }
    public String getAuthor()
    {
        return this.author;
    }
    // 价格prtice的setter、gettter方法
    public void setPrice(double price)
    {
        this.price = price;
    }
    public double getPrice()
    {
        return this.price;
    }
    // 出版社press的setter、gettter方法
    public void setPress(String press)
    {
        this.press = press;
    }
    public String getPress()
    {
        return this.press;
    }
    // 类别kind的setter、gettter方法
    public void setKind(String kind)
    {
        this.kin = kind;
    }
    public String getKind()
    {
        return this.kin;
    }
    public String getBookInfo() // 取得书的完整信息
    {
        return "书本信息：" + "\n" + 
                "编号：" + this.ID + "\n" +
                "书名：" + this.name + "\n" +
                "作者：" + this.author + "\n" +
                "价格：" + this.price + "\n" +
                "出版社：" + this.press + "\n" + 
                "类别：" + this.kin;
    } 
    
    public static void main(String[] args) {
    	Book b=new Book();
    	System.out.println(b.getBookInfo());
    }
}
