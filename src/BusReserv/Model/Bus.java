    package BusReserv.Model;

    public class Bus {
        private String BusName;
        private  String Path;
        private  String Destination;
        private  int  capacity;
        public Bus(String busName, String path, String destination, int capacity) {
            BusName = busName;
            Path = path;
            Destination = destination;
            this.capacity = capacity;
        }

        public String getDestination() {
            return Destination;
        }

        public void setDestination(String destination) {
            Destination = destination;
        }

        public String getBusName() {
            return BusName;
        }

        public void setBusName(String busName) {
            BusName = busName;
        }

        public String getPath() {
            return Path;
        }

        public void setPath(String path) {
            Path = path;
        }

        public int getCapacity() {
            return capacity;
        }

        public void setCapacity(int capacity) {
            this.capacity = capacity;
        }
        public void displayBus()
        {
            System.out.println(this.BusName + "->" + this.Path + ">" + this.Destination);
        }
        public boolean PassengerPathAvailble(Passenger p)
        {
     if(this.Destination.equalsIgnoreCase(p.getDestination()))
     {
         if(this.capacity > 0) {
             return true;
         }
     }
     return  false;
        }




    }
