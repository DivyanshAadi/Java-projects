    class Box{
    double width,height,depth;
    Box(){
        width=10;
        height=20;
        depth=30;

    }
    Box(double w,double h,double d){
        width=w;
        height=h;
        depth=d;  
    }
    //copy constructor
    Box(Box t) {
    width=t.width;
    height=t.height;
    depth=t.depth;
    }
    void display(){
        System.out.println(width+height+depth);
    }
    
    void display(Box b)
    {
        System.out.println("b.Width="+width+"b.Height="+height+"b.Depth="+depth);
    }
    

    public static void main(String args[]){
        Box b1=new Box();
        Box b2=new Box();
        //b2.display(b1);
        Box b3=new Box(b1);
        b3.display();
            
    }
}