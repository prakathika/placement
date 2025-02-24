public class Main 
{ 
    public static final class Device {
        public static final int Max_device = 50;
        private int id;
        private String name;
        
        
        public Device(int id, String name) {
        this.id = id;
        this.name = name; 
            
        }
        public String getInfo() 
        { 
            return "ID: " + id + ", Name: " + name; 
            
        } 
        
    } 
    public static final class Configuration
    {
        public static final int Max_power = 5000;
    }
    public static abstract class DeviceType
    { public abstract String getCategory(); 
        
    } 
    public static class LightDevice extends DeviceType
    { 
        public String getCategory() {
            return "Light";
        }
        }
        public static class FanDevice extends DeviceType
        { 
            public String getCategory() {
                return "Fan";
         }
 }
                public static void main(String[] args)
                { 
                    Device device = new Device(1, "Living Room Light");
                    System.out.println(device.getInfo());
                     System.out.println(" Max Power :" + Configuration.Max_power );
                     DeviceType light =new LightDevice();
                     DeviceType fan = new FanDevice();
                     System.out.println( " light category : "+ light.getCategory());
                     System.out.println( " fan category : "+ fan.getCategory());
                }
}
                     
                   