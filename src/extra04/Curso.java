
package extra04;

public class Curso {
    private int codigo;
    private String curso;
    private int tempo;
    private float duracao;
    private String nivel;
    private boolean inicio;

    public Curso(int codigo, String curso, int tempo, String nivel, boolean inicio) {
        this.codigo = codigo;
        this.curso = curso;
        this.setTempo(tempo);
        this.nivel = nivel;
        this.inicio = inicio;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCurso() {
        return this.curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getTempo() {
        return this.tempo;
    }

    private void setTempo(int tempo) {
        this.tempo= tempo;
        this.setDuracao();
    }

    public float getDuracao() {
        return this.duracao;
    }

    public void setDuracao() {
        if(this.tempo>=1600){
    if(this.tempo<2400){
        this.duracao = 2.5f;
    }else{
        if(this.tempo<3600){
            this.duracao = 4;
        }else{
            if(this.tempo>4000){
                this.duracao= 5;
            }else{
                if(this.tempo>7200){
                    this.duracao = 6;
                }else{
                }
            }
        }
    
  }
}else{
            this.duracao = 0;
        }
    }

    public String getNivel() {
        return this.nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }



    public boolean isInicio() {
        return this.inicio;
    }

    public void setInicio(boolean inscrito) {
        this.inicio = inicio;
        
              
    }
    
    public void statuscurso(){
        System.out.println("Código "+this.getCodigo());
        System.out.println("Curso "+this.getCurso());
        System.out.println("Tempo "+this.tempo+" horas");
        System.out.println("Duração de "+this.getDuracao()+" anos");
        System.out.println(this.isInicio());
    }
    public void iniciar(){
         if(this.inicio== true){
            System.out.println("Pode ser iniciado");
        }else{
            System.out.println("Aguarde a próxima turma");
        } 
    }

   
}
