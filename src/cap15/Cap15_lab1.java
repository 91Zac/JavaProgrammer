package cap15;
import java.util.HashMap;
import javax.swing.JOptionPane;
public class Cap15_lab1 {
    public static void main(String[] args) {        
        HashMap<String, Integer> pessoaMap = new HashMap<>();
        pessoaMap.put("Roberto", 35);
        pessoaMap.put("Carla", 26);
        pessoaMap.put("Gabriel", 18);
        pessoaMap.put("Bruno", 17);

        System.out.println(" -- Pessoas --");        
        pessoaMap.forEach((k, v) -> System.out.println(k + ": " + v));
        
        int resp=0;
        do
        {
        	Pessoa p = new Pessoa(
        			JOptionPane.showInputDialog("Digite o nome: "), 
        			Integer.parseInt(JOptionPane.showInputDialog("Digite a idade: ")));
        	pessoaMap.put(p.getNome() , p.getIdade());
        	resp=JOptionPane.showConfirmDialog(null, "Cadastrar Outro?");
        }while(resp==0);        
        pessoaMap.forEach((k, v) -> System.out.println(k + ": " + v));        
    }
}