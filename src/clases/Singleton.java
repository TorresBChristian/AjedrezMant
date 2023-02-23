package clases;

import javax.swing.JFrame;

class Singleton {
    private static Singleton instancia = null;
    private Singleton() {
    }
    
    public static Singleton obtener_instancia() {
        if(instancia == null)
            instancia = new Singleton();
        return instancia;
    }
    
    public void iniciar_juego() {
        System.out.println("YetAnotherChessGame 1.0");
        JFrame frame = new JFrame( "YetAnotherChessGame 1.0" );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.getContentPane().add( new ChessPanel() );
        frame.pack();
        frame.setVisible( true );
    }
}

class SingletonMain {
    public static void main( String[] args ){
        Singleton juego1;
        juego1 = Singleton.obtener_instancia();
        juego1.iniciar_juego();
    }
}


