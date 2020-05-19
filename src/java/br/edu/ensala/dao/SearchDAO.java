package br.edu.ensala.dao;

import br.edu.ensala.conn.Conn;
import br.edu.ensala.bean.Search;
import br.edu.ensala.request.SearchRequest;
import br.edu.ensala.response.SearchResponse;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class SearchDAO {
    
    public static SearchResponse searchData(SearchRequest searchRequest) {
        
        SearchResponse searchResponse = new SearchResponse();
        Search search = new Search();
        
        Connection conn = Conn.getConexao();
        
        PreparedStatement stmt = null;
        
        ResultSet rs = null;
        
        try {
            
            stmt = conn.prepareStatement("select * from reserve order by id_reserve desc limit " 
                    + searchRequest.getSearch().getLimit());

            rs = stmt.executeQuery();
            
            ArrayList<String[]> reservelist= new ArrayList<>();

            while(rs.next()){

                String[] reserveArray = {rs.getString("id_reserve"),
                                         rs.getString("id_room"),
                                         rs.getString("reserve_date"),
                                         rs.getString("created_at"),
                                         rs.getString("canceled_at")};
                
                reservelist.add(reserveArray);
                
            }
            
            stmt = conn.prepareStatement("select * from room");
            
            rs = stmt.executeQuery();
            
            ArrayList<String[]> roomlist= new ArrayList<>();

            while(rs.next()){

                String[] roomArray = {rs.getString("id_room"),
                                      rs.getString("room")};
                
                roomlist.add(roomArray);
                
            }
            
            search.setReserves(reservelist);
            search.setRooms(roomlist);
            search.setLimit(searchRequest.getSearch().getLimit());
            
            searchResponse.setSearch(search);
            searchResponse.setResponse(true);
            
        }
        catch (SQLException ex) {
            
            System.out.println(ex);
            
        }
        finally{
            
            Conn.closeConexao(conn,stmt,rs);
            
        }
        
        return searchResponse;
        
    }
    
}
