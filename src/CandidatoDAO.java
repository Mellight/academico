
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class CandidatoDAO {
    
    String sSql;
    Connection con;
    PreparedStatement pstmt;

// **************************************************************************** //
    
    public List<Candidato> listarCan() {
        List listaCandidato;
        listaCandidato = new ArrayList<>();
        ResultSet rs;
        Candidato c;

        sSql = "SELECT * from candidato ORDER BY can_votos DESC";
        try {
            con = Conexao.getConexao();
            pstmt = con.prepareStatement(sSql);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                c = new Candidato();
                c.setNumero(rs.getInt("can_numero"));
                c.setNome(rs.getString("can_nome"));
                c.setVice(rs.getString("can_vice"));
                c.setPartido(rs.getString("can_partido"));
                c.setFoto(rs.getString("can_foto"));
                c.setFotovice(rs.getString("can_fotovice"));
                c.setVotos(rs.getInt("can_votos"));
                listaCandidato.add(c);
            }
        } catch (SQLException e) {
            listaCandidato = null;
            System.out.println("Erro ao listar candidatos - " + e.getMessage());
        }
        return listaCandidato;
    }

// **************************************************************************** //
    public Candidato consultaCan(String numero) {
        ResultSet rs;
        Candidato c = new Candidato();
        con = null;

        sSql = "SELECT can_numero, can_nome, can_vice, can_partido, "
                + "can_foto, can_fotovice, can_votos "
                + "FROM candidato WHERE can_numero = ?";

        try {

            con = Conexao.getConexao();
            pstmt = con.prepareStatement(sSql);
            pstmt.setString(1, numero);
            rs = pstmt.executeQuery();

            if (rs.next()) {
                c.setNumero(rs.getInt("can_numero"));
                c.setNome(rs.getString("can_nome"));
                c.setVice(rs.getString("can_vice"));
                c.setPartido(rs.getString("can_partido"));
                c.setFoto(rs.getString("can_foto"));
                c.setFotovice(rs.getString("can_fotovice"));
                c.setVotos(rs.getInt("can_votos"));
            } else {
                c = null;
            }
            pstmt.close();
            rs.close();
            con.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar candidato - " + erro.getMessage(), "ELEIÇÃO 2021 ::: Sistema", 0);
        }
        return c;
    }

// **************************************************************************** //
    public void resetVotos(Candidato c) {
        try {
            con = Conexao.getConexao();
            pstmt = con.prepareStatement("UPDATE candidato SET can_votos = 0");

            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Votos reiniciados com sucesso!", "ELEIÇÃO 2021 ::: Sistema", 1);
            pstmt.close();
            con.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao reiniciar os votos dos candidatos!\nErro: " + erro, "ELEIÇÃO 2021 ::: Sistema", 0);
        }
    }

// **************************************************************************** //
    public void contarVotos(Candidato c) {
        try {
            con = Conexao.getConexao();
            pstmt = con.prepareStatement("UPDATE candidato SET can_votos = can_votos + 1 "
                    + "WHERE can_numero = ?");
            pstmt.setString(1, String.valueOf(c.getVotos()));

            pstmt.executeUpdate();
            pstmt.close();
            con.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao computar o voto do candidato!\nErro: " + erro, "ELEIÇÃO 2021 ::: Sistema", 0);
        }
    }
}
