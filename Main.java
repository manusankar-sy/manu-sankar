class Animal{
void sound(){
System.out.println(" Animal makes a sound");
}
}
class crow extends animal{
@Override void  Sound(){
System.out.println("crow crow");
}
}
class main{
Public static void main(String[] args){
crow c=new crow();
c.sound();
}
}
