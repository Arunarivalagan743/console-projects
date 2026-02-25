package Hospital.Imple;

import Hospital.Service.RoomService;
import Hospital.models.Room;

import java.util.HashMap;
import java.util.Map;

public class RoomServiceImpl implements RoomService {

    private Map<Integer, Room> roomMap = new HashMap<>();


    @Override
    public void addRoom(Room room) {

        if (room == null) {
            throw new IllegalArgumentException("Room cannot be null");
        }

        roomMap.put(room.getRoomNo(), room);
    }


    @Override
    public void allocateRoom(int roomNo) {

        Room room = roomMap.get(roomNo);

        if (room == null) {
            throw new RuntimeException("Room not found: " + roomNo);
        }

        if (room.isOccupied()) {
            throw new RuntimeException("Room already occupied: " + roomNo);
        }

        room.occupy();
    }


    @Override
    public void vacateRoom(int roomNo) {

        Room room = roomMap.get(roomNo);

        if (room == null) {
            throw new RuntimeException("Room not found: " + roomNo);
        }

        if (!room.isOccupied()) {
            throw new RuntimeException("Room is already vacant");
        }

        room.vacate();
    }


    @Override
    public Room getRoom(int roomNo) {

        Room room = roomMap.get(roomNo);

        if (room == null) {
            throw new RuntimeException("Room not found: " + roomNo);
        }

        return room;
    }
}