package br.edu.ensala.dao;

import br.edu.ensala.bean.Room;
import br.edu.ensala.conn.Conn;
import br.edu.ensala.request.RoomRequest;
import br.edu.ensala.response.RoomResponse;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RoomDAO {
    
    public static RoomResponse verifyRoom(RoomRequest roomRequest) {
        
        RoomResponse roomResponse = new RoomResponse();
        Room room = new Room();
        
        Connection conn = Conn.getConexao();
        
        PreparedStatement stmt = null;
        
        ResultSet rs = null;
        
        try {
            
            stmt = conn.prepareStatement("select * from reserve where id_room = ? and reserve_date = ? and canceled_at is null");
            
            stmt.setInt(1,roomRequest.getRoom().getId_room());
            stmt.setString(2,roomRequest.getRoom().getReserve_date());
            
            rs = stmt.executeQuery();
            
            int test = 0;

            while(rs.next()){
                
                test++;
                        
            }
            
            roomResponse.setRoom(room);
            
            if(test < 1){

                reserveRoom(roomRequest.getRoom().getReserve_date(),
                            roomRequest.getRoom().getId_user(),
                            roomRequest.getRoom().getId_room());
                
                room.setReserve_date(roomRequest.getRoom().getReserve_date());
                room.setId_user(roomRequest.getRoom().getId_user());
                room.setId_room(roomRequest.getRoom().getId_room());
                
                roomResponse.setResponse(true);
            
            }
            else{
                
                roomResponse.setResponse(false);
                
            }
            
        }
        catch (SQLException ex) {
            
            System.out.println(ex);
            
        }
        finally{
            
            Conn.closeConexao(conn,stmt,rs);
            
        }
        
        return roomResponse;
        
    }
    
    public static void reserveRoom(String reserve_date, int id_user, int id_room){
        
        Connection conn = Conn.getConexao();
        
        PreparedStatement stmt = null;
        
        try {
            
            stmt = conn.prepareStatement("insert into reserve (id_user, id_room, reserve_date, created_at) VALUES (?,?,?,now())");
            
            stmt.setInt(1,id_user);
            stmt.setInt(2,id_room);
            stmt.setString(3,reserve_date);
            
            stmt.executeUpdate();
            
        }
        catch (SQLException ex) {
            
            System.out.println(ex);
            
        }
        finally{
            
            Conn.closeConexao(conn,stmt);
            
        } 
        
    }
    
}
