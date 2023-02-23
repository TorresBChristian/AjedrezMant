package clases;

import javax.swing.JFrame;

class Factory {
    public ChessGamePiece crear_pieza(ChessGameBoard tablero, String pieza, int color, int columna, int fila){
       ChessGamePiece obj_pieza = null;
       if("King".equals(pieza))
           obj_pieza = new King(tablero, columna, fila, color);
       else if("Queen".equals(pieza))
           obj_pieza = new Queen(tablero, columna, fila, color);
       else if("Rook".equals(pieza))
           obj_pieza = new Rook(tablero, columna, fila, color);
       else if("Knight".equals(pieza))
           obj_pieza = new Knight(tablero, columna, fila, color);
       else if("Bishop".equals(pieza))
           obj_pieza = new Bishop(tablero, columna, fila, color);
       else if("Pawn".equals(pieza))
           obj_pieza = new Pawn(tablero, columna, fila, color);
       
       return obj_pieza;
    }
}

class FactoryMain {
    public static void main( String[] args ){
        JFrame frame = new JFrame( "YetAnotherChessGame 1.0" );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.getContentPane().add( new ChessPanel() );
        frame.pack();
        frame.setVisible( true );
    }
}


