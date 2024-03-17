
public class TestSimpleCircle {
    public static void main(String[] args) {
        SimpleCircle Circle1 = new SimpleCircle();
        System.out.println("The area of circle1 radius "+Circle1.radius+" is "+Circle1.getArea());
        SimpleCircle Circle2 = new SimpleCircle(25);
        System.out.println("The area of circle2 radius "+Circle2.radius+" is "+Circle2.getArea());
        SimpleCircle Circle3 = new SimpleCircle(125);
        System.out.println("The area of circle3 radius "+Circle3.radius+" is "+Circle3.getArea());
        Circle2.radius = 100;//change circle2 raduis to 100 or Circle2.setRadius(100);
        System.out.println("The area of circle2 radius "+Circle2.radius+" is "+Circle1.getArea());
        
    }
}
        class SimpleCircle {
            double radius;
        
            SimpleCircle(){
                radius = 1;
            }
            SimpleCircle(double newRadius){
                radius = newRadius;
            }
            double getArea(){
                return radius * radius * Math.PI;
            }
            double getPerimetr(){
                return radius * radius * Math.PI;
            }
            void setRadius(double newRadius){
                radius = newRadius;
            }
        }   

