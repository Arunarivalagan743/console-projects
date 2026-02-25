package Hospital.Service;

import Hospital.models.Room;

public interface RoomService {
    void  addRoom(Room room);
    void allocateRoom(int roomNo);

    void vacateRoom(int roomNo);

    Room getRoom(int roomNo);
}
