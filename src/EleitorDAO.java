
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class EleitorDAO {

    String sSql;
    Connection con;
    PreparedStatement pstmt;

    public Eleitor consultaEle(String titulo) {
        ResultSet rs;
        Eleitor e = new Eleitor();
        con = null;

        sSql = "SELECT ele_titulo, ele_rg, ele_nome, ele_dataNasc, ele_zona, "
                + "ele_secao, ele_votou, ele_foto, ele_cidade, ele_estado "
                + "FROM eleitor WHERE ele_titulo = ?";

        try {
            con = Conexao.getConexao();
            pstmt = con.prepareStatement(sSql);
            pstmt.setString(1, titulo);
            rs = pstmt.executeQuery();
            if (rs.next()) {
                e.setTitulo(rs.getString("ele_titulo"));
                e.setRg(rs.getString("ele_rg"));
                e.setNome(rs.getString("ele_nome"));
                e.setDataNasc(rs.getString("ele_dataNasc"));
                e.setZona(rs.getString("ele_zona"));
                e.setSecao(rs.getString("ele_secao"));
                e.setVotou(rs.getString("ele_votou"));
                e.setFoto(rs.getString("ele_foto"));
                e.setCidade(rs.getString("ele_cidade"));
                e.setEstado(rs.getString("ele_estado"));
            } else {
                e = null;
            }
            pstmt.close();
            rs.close();
            con.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao consultar eleitor!\nErro: " + erro.getMessage(), "ELEIÇÃO 2021 ::: Sistema", 0);
        }
        return e;
    }

    // ------------------------------------------------------------------------ //
    public List<Eleitor> listarEle() {
        List listaEleitor;
        listaEleitor = new ArrayList<>();
        ResultSet rs;
        Eleitor e;

        sSql = "SELECT * from eleitor ORDER BY ele_votou DESC";
        try {
            con = Conexao.getConexao();
            pstmt = con.prepareStatement(sSql);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                e = new Eleitor();
                e.setTitulo(rs.getString("ele_titulo"));
                e.setRg(rs.getString("ele_rg"));
                e.setNome(rs.getString("ele_nome"));
                e.setDataNasc(rs.getString("ele_dataNasc"));
                e.setZona(rs.getString("ele_zona"));
                e.setSecao(rs.getString("ele_secao"));
                e.setVotou(rs.getString("ele_votou"));
                e.setFoto(rs.getString("ele_foto"));
                e.setCidade(rs.getString("ele_cidade"));
                e.setEstado(rs.getString("ele_estado"));
                listaEleitor.add(e);
            }
        } catch (SQLException erro) {
            listaEleitor = null;
            System.out.println("Erro ao listar candidatos - " + erro.getMessage());
        }
        return listaEleitor;
    }

    // ------------------------------------------------------------------------ //
    public void editarEleitor(Eleitor e) {
        try {
            con = Conexao.getConexao();
            pstmt = con.prepareStatement("UPDATE ELEITOR SET ele_votou=? WHERE ele_titulo=?");

            pstmt.setString(1, e.getVotou());
            pstmt.setString(2, e.getTitulo());

            pstmt.executeUpdate();
            // JOptionPane.showMessageDialog(null, "Identificação de voto do eleitor efetuado com sucesso!", "ELEIÇÃO 2021 ::: Sistema", 1);
            pstmt.close();
            con.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao identificar voto do eleitor!\nErro: " + erro, "ELEIÇÃO 2021 ::: Sistema", 0);
        }
    }
    
    
    public void resetEleVotou(Eleitor e) {
        try {
            con = Conexao.getConexao();
            pstmt = con.prepareStatement("UPDATE eleitor SET ele_votou = 'N'");

            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Status dos eleitores reiniciados com sucesso!", "ELEIÇÃO 2021 ::: Sistema", 1);
            pstmt.close();
            con.close();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ao reiniciar os status dos eleitores!\nErro: " + erro, "ELEIÇÃO 2021 ::: Sistema", 0);
        }
    }
    
    
}
