package br.edu.ensala.dao;

import br.edu.ensala.conn.Conn;
import br.edu.ensala.request.CancelRequest;
import br.edu.ensala.response.CancelResponse;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CancelDAO {
    
    public static CancelResponse cancel(CancelRequest cancelRequest) throws SQLException {
        
        CancelResponse cancelResponse = new CancelResponse();
        
        Connection conn = Conn.getConexao();
        
        Statement stmt = conn.createStatement();
        
        try {
            
            stmt.executeUpdate("update reserve set canceled_at = '" + cancelRequest.getRoom().getCanceled_at()
                                          + "' where id_reserve = " + cancelRequest.getRoom().getId_reserve());
            
            cancelResponse.setRoom(cancelRequest.getRoom());
            cancelResponse.setResponse(true);
            
        }
        catch (SQLException ex) {
            
            System.out.println(ex);
            
        }
        finally{
            
            conn.close();
            stmt.close();
            
        }
        
        return cancelResponse;
        
    }
    
}
