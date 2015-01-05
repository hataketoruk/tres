package com.example.tresenrayafinal;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import com.example.tresenrayafinal.R;

public class JuegoCpu extends Activity{
	
	private TextView A1,B1,C1,D1,E1,A2,B2,C2,D2,E2,A3,B3,C3,D3,E3,A4,B4,C4,D4,E4,A5,B5,C5,D5,E5;
    
    private String casilla1=new String("-1");
    private String casilla2=new String("-1");
    private String casilla3=new String("-1");
    private String casilla4=new String("-1");
    private String casilla5=new String("-1");
    private String casilla6=new String("-1");
    private String casilla7=new String("-1");
    private String casilla8=new String("-1");
    private String casilla9=new String("-1");
    private String casilla10=new String("-1");
    private String casilla11=new String("-1");
    private String casilla12=new String("-1");
    private String casilla13=new String("-1");
    private String casilla14=new String("-1");
    private String casilla15=new String("-1");
    private String casilla16=new String("-1");
    private String casilla17=new String("-1");
    private String casilla18=new String("-1");
    private String casilla19=new String("-1");
    private String casilla20=new String("-1");
    private String casilla21=new String("-1");
    private String casilla22=new String("-1");
    private String casilla23=new String("-1");
    private String casilla24=new String("-1");
    private String casilla25=new String("-1");
    
    private String mensaje;
	private String titulo;
	private String aceptar;
    private int jugador=0;
    private int contador=0;
    private MediaPlayer mp;
    private TextView ventanaFin;
    private Random random = new Random();
    
	public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.extra);
        this.A1 = (TextView) findViewById(R.id.A1);
        this.B1 = (TextView) findViewById(R.id.B1);
        this.C1 = (TextView) findViewById(R.id.C1);
        this.D1 = (TextView) findViewById(R.id.D1);
        this.E1 = (TextView) findViewById(R.id.E1);
        
        this.A2 = (TextView) findViewById(R.id.A2);
        this.B2 = (TextView) findViewById(R.id.B2);
        this.C2 = (TextView) findViewById(R.id.C2);
        this.D2 = (TextView) findViewById(R.id.D2);
        this.E2 = (TextView) findViewById(R.id.E2);
        
        this.A3 = (TextView) findViewById(R.id.A3);
        this.B3 = (TextView) findViewById(R.id.B3);
        this.C3 = (TextView) findViewById(R.id.C3);
        this.D3 = (TextView) findViewById(R.id.D3);
        this.E3 = (TextView) findViewById(R.id.E3);
        

        this.A4 = (TextView) findViewById(R.id.A4);
        this.B4 = (TextView) findViewById(R.id.B4);
        this.C4 = (TextView) findViewById(R.id.C4);
        this.D4 = (TextView) findViewById(R.id.D4);
        this.E4 = (TextView) findViewById(R.id.E4);
        

        this.A5 = (TextView) findViewById(R.id.A5);
        this.B5 = (TextView) findViewById(R.id.B5);
        this.C5 = (TextView) findViewById(R.id.C5);
        this.D5 = (TextView) findViewById(R.id.D5);
        this.E5 = (TextView) findViewById(R.id.E5);
        
        this.ventanaFin= (TextView) findViewById(R.id.juegoFin);
   
        
	}
	
	public void pulsax1(View view){
		
		mp.start();
	        
		if(this.jugador==0 && view.isClickable()){
        	this.casilla1="X";
			this.A1.setBackgroundResource(R.drawable.cruz);
        	this.A1.setClickable(false);
        	
        	int fin= this.juegoAcabado();
        	if(fin!=-1){
        		
        		if(fin==0){
        				this.ventanaFin.getText();
        				 mensaje="Ganan las Cruces";
        				 titulo="Juego Acabado";
        				 aceptar="Aceptar";
        			
        			
        			AlertDialog.Builder builder = new AlertDialog.Builder(this);
        			builder.setMessage(mensaje)
        			        .setTitle(titulo)
        			        .setCancelable(false)
        			        .setNeutralButton(aceptar,
        			                new DialogInterface.OnClickListener() {
        			                    public void onClick(DialogInterface dialog, int id) {
        			                        dialog.cancel();
        			                    }
        			                });
        			AlertDialog alert = builder.create();
        			alert.show();
        			return;
        			
        		}
        		
        		else if(fin==2){
        		         this.ventanaFin.getText();
	       				 mensaje="Han Empatado";
	       				 titulo="Juego Acabado";
	       				 aceptar="Aceptar";
	       			
        			
        			AlertDialog.Builder builder = new AlertDialog.Builder(this);
        			builder.setMessage(mensaje)
        			        .setTitle(titulo)
        			        .setCancelable(false)
        			        .setNeutralButton(aceptar,
        			                new DialogInterface.OnClickListener() {
        			                    public void onClick(DialogInterface dialog, int id) {
        			                        dialog.cancel();
        			                    }
        			                });
        			AlertDialog alert = builder.create();
        			alert.show();
        			return;
        			
        		}
        		
        	}
        	
        	this.jugador=1;
        	juegaCpu();
        	
	 }
        else if (this.jugador==1){
        	this.casilla1="0";
			this.A1.setBackgroundResource(R.drawable.circulo);
        	this.A1.setClickable(false);
        	int fin= this.juegoAcabado();
        	
        	if(fin!=-1){
        		if(fin==1){
        			this.ventanaFin.getText();
        				 mensaje="Ganan los Circulos";
        				 titulo="Juego Acabado";
        				 aceptar="Aceptar";
        			
        			
        			AlertDialog.Builder builder = new AlertDialog.Builder(this);
        			builder.setMessage(mensaje)
        			        .setTitle(titulo)
        			        .setCancelable(false)
        			        .setNeutralButton(aceptar,
        			                new DialogInterface.OnClickListener() {
        			                    public void onClick(DialogInterface dialog, int id) {
        			                        dialog.cancel();
        			                    }
        			                });
        			AlertDialog alert = builder.create();
        			alert.show();
        			
        		}
        		
        		else if(fin==2){
        			this.ventanaFin.getText();
	       				 mensaje="Han Empatado";
	       				 titulo="Juego Acabado";
	       				 aceptar="Aceptar";
	       			
        			
        			AlertDialog.Builder builder = new AlertDialog.Builder(this);
        			builder.setMessage(mensaje)
        			        .setTitle(titulo)
        			        .setCancelable(false)
        			        .setNeutralButton(aceptar,
        			                new DialogInterface.OnClickListener() {
        			                    public void onClick(DialogInterface dialog, int id) {
        			                        dialog.cancel();
        			                    }
        			                });
        			AlertDialog alert = builder.create();
        			alert.show();
        			
        		}
        		
        	}
        	this.jugador=0;
        	
        }
	} 
	
	public void pulsax2(View view){
	    
		mp.start();
		
		if(this.jugador==0 && view.isClickable()){
			this.casilla2="X";
			this.B1.setBackgroundResource(R.drawable.cruz);
        	this.B1.setClickable(false);
        	
        	int fin= this.juegoAcabado();
        	if(fin!=-1){
        		if(fin==0){
        			this.ventanaFin.getText();
        				 mensaje="Ganan las Cruces";
        				 titulo="Juego Acabado";
        				 aceptar="Aceptar";
        			
        			
        			AlertDialog.Builder builder = new AlertDialog.Builder(this);
        			builder.setMessage(mensaje)
        			        .setTitle(titulo)
        			        .setCancelable(false)
        			        .setNeutralButton(aceptar,
        			                new DialogInterface.OnClickListener() {
        			                    public void onClick(DialogInterface dialog, int id) {
        			                        dialog.cancel();
        			                    }
        			                });
        			AlertDialog alert = builder.create();
        			alert.show();
        			return;
        			
        		}
        		
        		else if(fin==2){
        			
        			this.ventanaFin.getText();
	       				 mensaje="Han Empatado";
	       				 titulo="Juego Acabado";
	       				 aceptar="Aceptar";
	       			
        			
        			AlertDialog.Builder builder = new AlertDialog.Builder(this);
        			builder.setMessage(mensaje)
        			        .setTitle(titulo)
        			        .setCancelable(false)
        			        .setNeutralButton(aceptar,
        			                new DialogInterface.OnClickListener() {
        			                    public void onClick(DialogInterface dialog, int id) {
        			                        dialog.cancel();
        			                    }
        			                });
        			AlertDialog alert = builder.create();
        			alert.show();
        			return;
        			
        		}
        		
        	}
        	
        	this.jugador=1;
        	juegaCpu();
        	
	 }
        else if(this.jugador==1){
        	this.casilla2="0";
			this.B1.setBackgroundResource(R.drawable.circulo);
        	this.B1.setClickable(false);
        	int fin= this.juegoAcabado();
        	if(fin!=-1){
        		if(fin==1){
        			
        			this.ventanaFin.getText();
        				 mensaje="Ganan los Circulos";
        				 titulo="Juego Acabado";
        				 aceptar="Aceptar";
        		
        			
        			AlertDialog.Builder builder = new AlertDialog.Builder(this);
        			builder.setMessage(mensaje)
        			        .setTitle(titulo)
        			        .setCancelable(false)
        			        .setNeutralButton(aceptar,
        			                new DialogInterface.OnClickListener() {
        			                    public void onClick(DialogInterface dialog, int id) {
        			                        dialog.cancel();
        			                    }
        			                });
        			AlertDialog alert = builder.create();
        			alert.show();
        			
        		}
        		
        		else if(fin==2){
        			this.ventanaFin.getText();
	       				 mensaje="Han Empatado";
	       				 titulo="Juego Acabado";
	       				 aceptar="Aceptar";
	       			
        			
        			AlertDialog.Builder builder = new AlertDialog.Builder(this);
        			builder.setMessage(mensaje)
        			        .setTitle(titulo)
        			        .setCancelable(false)
        			        .setNeutralButton(aceptar,
        			                new DialogInterface.OnClickListener() {
        			                    public void onClick(DialogInterface dialog, int id) {
        			                        dialog.cancel();
        			                    }
        			                });
        			AlertDialog alert = builder.create();
        			alert.show();
        			
        		}
        		
        	}
        	this.jugador=0;
        	
        }
	
	} 
	public void pulsax3(View view){
	    
		mp.start();
		
		if(this.jugador==0 && view.isClickable()){
			this.casilla3="X";
			this.C1.setBackgroundResource(R.drawable.cruz);
        	this.C1.setClickable(false);
        	
        	int fin= this.juegoAcabado();
        	if(fin!=-1){
        		if(fin==0){
        			
        			this.ventanaFin.getText();
        				 mensaje="Ganan las Cruces";
        				 titulo="Juego Acabado";
        				 aceptar="Aceptar";
        			
        			
        			AlertDialog.Builder builder = new AlertDialog.Builder(this);
        			builder.setMessage(mensaje)
        			        .setTitle(titulo)
        			        .setCancelable(false)
        			        .setNeutralButton(aceptar,
        			                new DialogInterface.OnClickListener() {
        			                    public void onClick(DialogInterface dialog, int id) {
        			                        dialog.cancel();
        			                    }
        			                });
        			AlertDialog alert = builder.create();
        			alert.show();
        			return;
        			
        		}
        		
        		else if(fin==2){
        			
        			this.ventanaFin.getText();
	       				 mensaje="Han Empatado";
	       				 titulo="Juego Acabado";
	       				 aceptar="Aceptar";
	       			
        			
        			AlertDialog.Builder builder = new AlertDialog.Builder(this);
        			builder.setMessage(mensaje)
        			        .setTitle(titulo)
        			        .setCancelable(false)
        			        .setNeutralButton(aceptar,
        			                new DialogInterface.OnClickListener() {
        			                    public void onClick(DialogInterface dialog, int id) {
        			                        dialog.cancel();
        			                    }
        			                });
        			AlertDialog alert = builder.create();
        			alert.show();
        			return;
        			
        		}
        		
        	}
        	this.jugador=1;
        	juegaCpu();
        	
	 }
        else if (this.jugador==1){
        	this.casilla3="0";
			this.C1.setBackgroundResource(R.drawable.circulo);
        	this.C1.setClickable(false);
        	int fin= this.juegoAcabado();
        	if(fin!=-1){
        		if(fin==1){
        			
        			this.ventanaFin.getText();
        				 mensaje="Ganan los Circulos";
        				 titulo="Juego Acabado";
        				 aceptar="Aceptar";
        			
        			
        			AlertDialog.Builder builder = new AlertDialog.Builder(this);
        			builder.setMessage(mensaje)
        			        .setTitle(titulo)
        			        .setCancelable(false)
        			        .setNeutralButton(aceptar,
        			                new DialogInterface.OnClickListener() {
        			                    public void onClick(DialogInterface dialog, int id) {
        			                        dialog.cancel();
        			                    }
        			                });
        			AlertDialog alert = builder.create();
        			alert.show();
        			
        		}
        		
        		else if(fin==2){
        			
        			this.ventanaFin.getText();
	       				 mensaje="Han Empatado";
	       				 titulo="Juego Acabado";
	       				 aceptar="Aceptar";
	       			
        			
        			AlertDialog.Builder builder = new AlertDialog.Builder(this);
        			builder.setMessage(mensaje)
        			        .setTitle(titulo)
        			        .setCancelable(false)
        			        .setNeutralButton(aceptar,
        			                new DialogInterface.OnClickListener() {
        			                    public void onClick(DialogInterface dialog, int id) {
        			                        dialog.cancel();
        			                    }
        			                });
        			AlertDialog alert = builder.create();
        			alert.show();
        			
        		}
        		
        	}
        	this.jugador=0;
        	
        }
	
	} 
	
//	-----------------------------------------------
public void pulsax4(View view){
	    
		mp.start();
		
		if(this.jugador==0 && view.isClickable()){
			this.casilla4="X";
			this.D1.setBackgroundResource(R.drawable.cruz);
        	this.D1.setClickable(false);
        	
        	int fin= this.juegoAcabado();
        	if(fin!=-1){
        		if(fin==0){
        			
        			this.ventanaFin.getText();
        				 mensaje="Ganan las Cruces";
        				 titulo="Juego Acabado";
        				 aceptar="Aceptar";
        			
        			
        			AlertDialog.Builder builder = new AlertDialog.Builder(this);
        			builder.setMessage(mensaje)
        			        .setTitle(titulo)
        			        .setCancelable(false)
        			        .setNeutralButton(aceptar,
        			                new DialogInterface.OnClickListener() {
        			                    public void onClick(DialogInterface dialog, int id) {
        			                        dialog.cancel();
        			                    }
        			                });
        			AlertDialog alert = builder.create();
        			alert.show();
        			return;
        			
        		}
        		
        		else if(fin==2){
        			
        			this.ventanaFin.getText();
	       				 mensaje="Han Empatado";
	       				 titulo="Juego Acabado";
	       				 aceptar="Aceptar";
	       			
        			
        			AlertDialog.Builder builder = new AlertDialog.Builder(this);
        			builder.setMessage(mensaje)
        			        .setTitle(titulo)
        			        .setCancelable(false)
        			        .setNeutralButton(aceptar,
        			                new DialogInterface.OnClickListener() {
        			                    public void onClick(DialogInterface dialog, int id) {
        			                        dialog.cancel();
        			                    }
        			                });
        			AlertDialog alert = builder.create();
        			alert.show();
        			return;
        			
        		}
        		
        	}
        	this.jugador=1;
        	juegaCpu();
        	
	 }
        else if (this.jugador==1){
        	this.casilla4="0";
			this.D1.setBackgroundResource(R.drawable.circulo);
        	this.D1.setClickable(false);
        	int fin= this.juegoAcabado();
        	if(fin!=-1){
        		if(fin==1){
        			
        			this.ventanaFin.getText();
        				 mensaje="Ganan los Circulos";
        				 titulo="Juego Acabado";
        				 aceptar="Aceptar";
        			
        			
        			AlertDialog.Builder builder = new AlertDialog.Builder(this);
        			builder.setMessage(mensaje)
        			        .setTitle(titulo)
        			        .setCancelable(false)
        			        .setNeutralButton(aceptar,
        			                new DialogInterface.OnClickListener() {
        			                    public void onClick(DialogInterface dialog, int id) {
        			                        dialog.cancel();
        			                    }
        			                });
        			AlertDialog alert = builder.create();
        			alert.show();
        			
        		}
        		
        		else if(fin==2){
        			
        			this.ventanaFin.getText();
	       				 mensaje="Han Empatado";
	       				 titulo="Juego Acabado";
	       				 aceptar="Aceptar";
	       			
        			
        			AlertDialog.Builder builder = new AlertDialog.Builder(this);
        			builder.setMessage(mensaje)
        			        .setTitle(titulo)
        			        .setCancelable(false)
        			        .setNeutralButton(aceptar,
        			                new DialogInterface.OnClickListener() {
        			                    public void onClick(DialogInterface dialog, int id) {
        			                        dialog.cancel();
        			                    }
        			                });
        			AlertDialog alert = builder.create();
        			alert.show();
        			
        		}
        		
        	}
        	this.jugador=0;
        	
        }
	
	} 
//---------------------------------------
	
public void pulsax5(View view){
    
	mp.start();
	
	if(this.jugador==0 && view.isClickable()){
		this.casilla5="X";
		this.E1.setBackgroundResource(R.drawable.cruz);
    	this.E1.setClickable(false);
    	
    	int fin= this.juegoAcabado();
    	if(fin!=-1){
    		if(fin==0){
    			
    			this.ventanaFin.getText();
    				 mensaje="Ganan las Cruces";
    				 titulo="Juego Acabado";
    				 aceptar="Aceptar";
    			
    			
    			AlertDialog.Builder builder = new AlertDialog.Builder(this);
    			builder.setMessage(mensaje)
    			        .setTitle(titulo)
    			        .setCancelable(false)
    			        .setNeutralButton(aceptar,
    			                new DialogInterface.OnClickListener() {
    			                    public void onClick(DialogInterface dialog, int id) {
    			                        dialog.cancel();
    			                    }
    			                });
    			AlertDialog alert = builder.create();
    			alert.show();
    			return;
    			
    		}
    		
    		else if(fin==2){
    			
    			this.ventanaFin.getText();
       				 mensaje="Han Empatado";
       				 titulo="Juego Acabado";
       				 aceptar="Aceptar";
       			
    			
    			AlertDialog.Builder builder = new AlertDialog.Builder(this);
    			builder.setMessage(mensaje)
    			        .setTitle(titulo)
    			        .setCancelable(false)
    			        .setNeutralButton(aceptar,
    			                new DialogInterface.OnClickListener() {
    			                    public void onClick(DialogInterface dialog, int id) {
    			                        dialog.cancel();
    			                    }
    			                });
    			AlertDialog alert = builder.create();
    			alert.show();
    			return;
    			
    		}
    		
    	}
    	this.jugador=1;
    	juegaCpu();
    	
 }
    else if (this.jugador==1){
    	this.casilla5="0";
		this.E1.setBackgroundResource(R.drawable.circulo);
    	this.E1.setClickable(false);
    	int fin= this.juegoAcabado();
    	if(fin!=-1){
    		if(fin==1){
    			
    			this.ventanaFin.getText();
    				 mensaje="Ganan los Circulos";
    				 titulo="Juego Acabado";
    				 aceptar="Aceptar";
    			
    			
    			AlertDialog.Builder builder = new AlertDialog.Builder(this);
    			builder.setMessage(mensaje)
    			        .setTitle(titulo)
    			        .setCancelable(false)
    			        .setNeutralButton(aceptar,
    			                new DialogInterface.OnClickListener() {
    			                    public void onClick(DialogInterface dialog, int id) {
    			                        dialog.cancel();
    			                    }
    			                });
    			AlertDialog alert = builder.create();
    			alert.show();
    			
    		}
    		
    		else if(fin==2){
    			
    			this.ventanaFin.getText();
       				 mensaje="Han Empatado";
       				 titulo="Juego Acabado";
       				 aceptar="Aceptar";
       			
    			
    			AlertDialog.Builder builder = new AlertDialog.Builder(this);
    			builder.setMessage(mensaje)
    			        .setTitle(titulo)
    			        .setCancelable(false)
    			        .setNeutralButton(aceptar,
    			                new DialogInterface.OnClickListener() {
    			                    public void onClick(DialogInterface dialog, int id) {
    			                        dialog.cancel();
    			                    }
    			                });
    			AlertDialog alert = builder.create();
    			alert.show();
    			
    		}
    		
    	}
    	this.jugador=0;
    	
    }

} 
//-----------------------------------------------------------

	public void pulsax6(View view){
	    
		mp.start();
		
		if(this.jugador==0 && view.isClickable()){
			this.casilla6="X";
			this.A2.setBackgroundResource(R.drawable.cruz);
        	this.A2.setClickable(false);
        	
        	int fin= this.juegoAcabado();
        	if(fin!=-1){
        		if(fin==0){
        			
        			this.ventanaFin.getText();
        				 mensaje="Ganan las Cruces";
        				 titulo="Juego Acabado";
        				 aceptar="Aceptar";
        			
        			
        			AlertDialog.Builder builder = new AlertDialog.Builder(this);
        			builder.setMessage(mensaje)
        			        .setTitle(titulo)
        			        .setCancelable(false)
        			        .setNeutralButton(aceptar,
        			                new DialogInterface.OnClickListener() {
        			                    public void onClick(DialogInterface dialog, int id) {
        			                        dialog.cancel();
        			                    }
        			                });
        			AlertDialog alert = builder.create();
        			alert.show();
        			return;
        			
        		}
        		
        		else if(fin==2){
        			this.ventanaFin.getText();
	       				 mensaje="Han Empatado";
	       				 titulo="Juego Acabado";
	       				 aceptar="Aceptar";
	       			
        			
        			AlertDialog.Builder builder = new AlertDialog.Builder(this);
        			builder.setMessage(mensaje)
        			        .setTitle(titulo)
        			        .setCancelable(false)
        			        .setNeutralButton(aceptar,
        			                new DialogInterface.OnClickListener() {
        			                    public void onClick(DialogInterface dialog, int id) {
        			                        dialog.cancel();
        			                    }
        			                });
        			AlertDialog alert = builder.create();
        			alert.show();
        			return;
        			
        		}
        		
        	}
        	this.jugador=1;
        	juegaCpu();
	 }
        else if (this.jugador==1){
        	this.casilla6="0";
			this.A2.setBackgroundResource(R.drawable.circulo);
        	this.A2.setClickable(false);
        	int fin= this.juegoAcabado();
        	if(fin!=-1){
        		if(fin==1){
        			
        			this.ventanaFin.getText();
        				 mensaje="Ganan los Circulos";
        				 titulo="Juego Acabado";
        				 aceptar="Aceptar";
        			
        			
        			AlertDialog.Builder builder = new AlertDialog.Builder(this);
        			builder.setMessage(mensaje)
        			        .setTitle(titulo)
        			        .setCancelable(false)
        			        .setNeutralButton(aceptar,
        			                new DialogInterface.OnClickListener() {
        			                    public void onClick(DialogInterface dialog, int id) {
        			                        dialog.cancel();
        			                    }
        			                });
        			AlertDialog alert = builder.create();
        			alert.show();
        			
        		}
        		
        		else if(fin==2){
        			
        			this.ventanaFin.getText();
	       				 mensaje="Han Empatado";
	       				 titulo="Juego Acabado";
	       				 aceptar="Aceptar";
	       			
        			
        			AlertDialog.Builder builder = new AlertDialog.Builder(this);
        			builder.setMessage(mensaje)
        			        .setTitle(titulo)
        			        .setCancelable(false)
        			        .setNeutralButton(aceptar,
        			                new DialogInterface.OnClickListener() {
        			                    public void onClick(DialogInterface dialog, int id) {
        			                        dialog.cancel();
        			                    }
        			                });
        			AlertDialog alert = builder.create();
        			alert.show();
        			
        		}
        		
        	}
        	this.jugador=0;
        	
        }

		 
	} 
	public void pulsax7(View view){
	    
		mp.start();
		
		if(this.jugador==0 && view.isClickable()){
			this.casilla7="X";
			this.B2.setBackgroundResource(R.drawable.cruz);
        	this.B2.setClickable(false);
        	
        	int fin= this.juegoAcabado();
        	if(fin!=-1){
        		if(fin==0){
        			
        			this.ventanaFin.getText();
        				 mensaje="Ganan las Cruces";
        				 titulo="Juego Acabado";
        				 aceptar="Aceptar";
        			
        			
        			AlertDialog.Builder builder = new AlertDialog.Builder(this);
        			builder.setMessage(mensaje)
        			        .setTitle(titulo)
        			        .setCancelable(false)
        			        .setNeutralButton(aceptar,
        			                new DialogInterface.OnClickListener() {
        			                    public void onClick(DialogInterface dialog, int id) {
        			                        dialog.cancel();
        			                    }
        			                });
        			AlertDialog alert = builder.create();
        			alert.show();
        			return;
        			
        		}
        		
        		else if(fin==2){
        			this.ventanaFin.getText();
	       				 mensaje="Han Empatado";
	       				 titulo="Juego Acabado";
	       				 aceptar="Aceptar";
	       			
        			
        			AlertDialog.Builder builder = new AlertDialog.Builder(this);
        			builder.setMessage(mensaje)
        			        .setTitle(titulo)
        			        .setCancelable(false)
        			        .setNeutralButton(aceptar,
        			                new DialogInterface.OnClickListener() {
        			                    public void onClick(DialogInterface dialog, int id) {
        			                        dialog.cancel();
        			                    }
        			                });
        			AlertDialog alert = builder.create();
        			alert.show();
        			return;
        			
        		}
        		
        	}
        	this.jugador=1;
        	juegaCpu();
        	
	 }
        else if (this.jugador==1){
        	this.casilla7="0";
			this.B2.setBackgroundResource(R.drawable.circulo);
        	this.B2.setClickable(false);
        	int fin= this.juegoAcabado();
        	if(fin!=-1){
        		if(fin==1){
        			this.ventanaFin.getText();
        				 mensaje="Ganan los Circulos";
        				 titulo="Juego Acabado";
        				 aceptar="Aceptar";
        			
        			
        			AlertDialog.Builder builder = new AlertDialog.Builder(this);
        			builder.setMessage(mensaje)
        			        .setTitle(titulo)
        			        .setCancelable(false)
        			        .setNeutralButton(aceptar,
        			                new DialogInterface.OnClickListener() {
        			                    public void onClick(DialogInterface dialog, int id) {
        			                        dialog.cancel();
        			                    }
        			                });
        			AlertDialog alert = builder.create();
        			alert.show();
        			
        		}
        		
        		else if(fin==2){
        			this.ventanaFin.getText();
	       				 mensaje="Han Empatado";
	       				 titulo="Juego Acabado";
	       				 aceptar="Aceptar";
	       			
        			
        			AlertDialog.Builder builder = new AlertDialog.Builder(this);
        			builder.setMessage(mensaje)
        			        .setTitle(titulo)
        			        .setCancelable(false)
        			        .setNeutralButton(aceptar,
        			                new DialogInterface.OnClickListener() {
        			                    public void onClick(DialogInterface dialog, int id) {
        			                        dialog.cancel();
        			                    }
        			                });
        			AlertDialog alert = builder.create();
        			alert.show();
        			
        		}
        		
        	}
        	this.jugador=0;
        	
        }

	
	} 
	public void pulsax8(View view){
	    
		mp.start();
		
		if(this.jugador==0 && view.isClickable()){
			this.casilla8="X";
			this.C2.setBackgroundResource(R.drawable.cruz);
        	this.C2.setClickable(false);
        	
        	int fin= this.juegoAcabado();
        	if(fin!=-1){
        		if(fin==0){
        			
        			this.ventanaFin.getText();
        				 mensaje="Ganan las Cruces";
        				 titulo="Juego Acabado";
        				 aceptar="Aceptar";
        			
        			
        			AlertDialog.Builder builder = new AlertDialog.Builder(this);
        			builder.setMessage(mensaje)
        			        .setTitle(titulo)
        			        .setCancelable(false)
        			        .setNeutralButton(aceptar,
        			                new DialogInterface.OnClickListener() {
        			                    public void onClick(DialogInterface dialog, int id) {
        			                        dialog.cancel();
        			                    }
        			                });
        			AlertDialog alert = builder.create();
        			alert.show();
        			return;
        			
        		}
        		
        		else if(fin==2){
        			this.ventanaFin.getText();
	       				 mensaje="Han Empatado";
	       				 titulo="Juego Acabado";
	       				 aceptar="Aceptar";
	       			
        			
        			AlertDialog.Builder builder = new AlertDialog.Builder(this);
        			builder.setMessage(mensaje)
        			        .setTitle(titulo)
        			        .setCancelable(false)
        			        .setNeutralButton(aceptar,
        			                new DialogInterface.OnClickListener() {
        			                    public void onClick(DialogInterface dialog, int id) {
        			                        dialog.cancel();
        			                    }
        			                });
        			AlertDialog alert = builder.create();
        			alert.show();
        			return;
        			
        		}
        		
        	}
        	this.jugador=1;
        	juegaCpu();
        	
	 }
        else if (this.jugador==1){
        	this.casilla8="0";
			this.C2.setBackgroundResource(R.drawable.circulo);
        	this.C2.setClickable(false);
        	int fin= this.juegoAcabado();
        	if(fin!=-1){
        		if(fin==1){
        			
        			this.ventanaFin.getText();
        				 mensaje="Ganan los Circulos";
        				 titulo="Juego Acabado";
        				 aceptar="Aceptar";
        			
        			
        			AlertDialog.Builder builder = new AlertDialog.Builder(this);
        			builder.setMessage(mensaje)
        			        .setTitle(titulo)
        			        .setCancelable(false)
        			        .setNeutralButton(aceptar,
        			                new DialogInterface.OnClickListener() {
        			                    public void onClick(DialogInterface dialog, int id) {
        			                        dialog.cancel();
        			                    }
        			                });
        			AlertDialog alert = builder.create();
        			alert.show();
        			
        		}
        		
        		else if(fin==2){
        			
        			this.ventanaFin.getText();
	       				 mensaje="Han Empatado";
	       				 titulo="Juego Acabado";
	       				 aceptar="Aceptar";
	       			
        			
        			AlertDialog.Builder builder = new AlertDialog.Builder(this);
        			builder.setMessage(mensaje)
        			        .setTitle(titulo)
        			        .setCancelable(false)
        			        .setNeutralButton(aceptar,
        			                new DialogInterface.OnClickListener() {
        			                    public void onClick(DialogInterface dialog, int id) {
        			                        dialog.cancel();
        			                    }
        			                });
        			AlertDialog alert = builder.create();
        			alert.show();
        			
        		}
        		
        	}
        	this.jugador=0;
        	
        }

	
	} 
	
	//---------------------------------------
	
	public void pulsax9(View view){
	    
		mp.start();
		
		if(this.jugador==0 && view.isClickable()){
			this.casilla9="X";
			this.D2.setBackgroundResource(R.drawable.cruz);
	    	this.D2.setClickable(false);
	    	
	    	int fin= this.juegoAcabado();
	    	if(fin!=-1){
	    		if(fin==0){
	    			
	    			this.ventanaFin.getText();
	    				 mensaje="Ganan las Cruces";
	    				 titulo="Juego Acabado";
	    				 aceptar="Aceptar";
	    			
	    			
	    			AlertDialog.Builder builder = new AlertDialog.Builder(this);
	    			builder.setMessage(mensaje)
	    			        .setTitle(titulo)
	    			        .setCancelable(false)
	    			        .setNeutralButton(aceptar,
	    			                new DialogInterface.OnClickListener() {
	    			                    public void onClick(DialogInterface dialog, int id) {
	    			                        dialog.cancel();
	    			                    }
	    			                });
	    			AlertDialog alert = builder.create();
	    			alert.show();
	    			return;
	    			
	    		}
	    		
	    		else if(fin==2){
	    			
	    			this.ventanaFin.getText();
	       				 mensaje="Han Empatado";
	       				 titulo="Juego Acabado";
	       				 aceptar="Aceptar";
	       			
	    			
	    			AlertDialog.Builder builder = new AlertDialog.Builder(this);
	    			builder.setMessage(mensaje)
	    			        .setTitle(titulo)
	    			        .setCancelable(false)
	    			        .setNeutralButton(aceptar,
	    			                new DialogInterface.OnClickListener() {
	    			                    public void onClick(DialogInterface dialog, int id) {
	    			                        dialog.cancel();
	    			                    }
	    			                });
	    			AlertDialog alert = builder.create();
	    			alert.show();
	    			return;
	    			
	    		}
	    		
	    	}
	    	this.jugador=1;
	    	juegaCpu();
	    	
	 }
	    else if (this.jugador==1){
	    	this.casilla9="0";
			this.D2.setBackgroundResource(R.drawable.circulo);
	    	this.D2.setClickable(false);
	    	int fin= this.juegoAcabado();
	    	if(fin!=-1){
	    		if(fin==1){
	    			
	    			this.ventanaFin.getText();
	    				 mensaje="Ganan los Circulos";
	    				 titulo="Juego Acabado";
	    				 aceptar="Aceptar";
	    			
	    			
	    			AlertDialog.Builder builder = new AlertDialog.Builder(this);
	    			builder.setMessage(mensaje)
	    			        .setTitle(titulo)
	    			        .setCancelable(false)
	    			        .setNeutralButton(aceptar,
	    			                new DialogInterface.OnClickListener() {
	    			                    public void onClick(DialogInterface dialog, int id) {
	    			                        dialog.cancel();
	    			                    }
	    			                });
	    			AlertDialog alert = builder.create();
	    			alert.show();
	    			
	    		}
	    		
	    		else if(fin==2){
	    			
	    			this.ventanaFin.getText();
	       				 mensaje="Han Empatado";
	       				 titulo="Juego Acabado";
	       				 aceptar="Aceptar";
	       			
	    			
	    			AlertDialog.Builder builder = new AlertDialog.Builder(this);
	    			builder.setMessage(mensaje)
	    			        .setTitle(titulo)
	    			        .setCancelable(false)
	    			        .setNeutralButton(aceptar,
	    			                new DialogInterface.OnClickListener() {
	    			                    public void onClick(DialogInterface dialog, int id) {
	    			                        dialog.cancel();
	    			                    }
	    			                });
	    			AlertDialog alert = builder.create();
	    			alert.show();
	    			
	    		}
	    		
	    	}
	    	this.jugador=0;
	    	
	    }

	} 
	
	//---------------------------------------
	
	public void pulsax10(View view){
	    
		mp.start();
		
		if(this.jugador==0 && view.isClickable()){
			this.casilla10="X";
			this.E2.setBackgroundResource(R.drawable.cruz);
	    	this.E2.setClickable(false);
	    	
	    	int fin= this.juegoAcabado();
	    	if(fin!=-1){
	    		if(fin==0){
	    			
	    			this.ventanaFin.getText();
	    				 mensaje="Ganan las Cruces";
	    				 titulo="Juego Acabado";
	    				 aceptar="Aceptar";
	    			
	    			
	    			AlertDialog.Builder builder = new AlertDialog.Builder(this);
	    			builder.setMessage(mensaje)
	    			        .setTitle(titulo)
	    			        .setCancelable(false)
	    			        .setNeutralButton(aceptar,
	    			                new DialogInterface.OnClickListener() {
	    			                    public void onClick(DialogInterface dialog, int id) {
	    			                        dialog.cancel();
	    			                    }
	    			                });
	    			AlertDialog alert = builder.create();
	    			alert.show();
	    			return;
	    			
	    		}
	    		
	    		else if(fin==2){
	    			
	    			this.ventanaFin.getText();
	       				 mensaje="Han Empatado";
	       				 titulo="Juego Acabado";
	       				 aceptar="Aceptar";
	       			
	    			
	    			AlertDialog.Builder builder = new AlertDialog.Builder(this);
	    			builder.setMessage(mensaje)
	    			        .setTitle(titulo)
	    			        .setCancelable(false)
	    			        .setNeutralButton(aceptar,
	    			                new DialogInterface.OnClickListener() {
	    			                    public void onClick(DialogInterface dialog, int id) {
	    			                        dialog.cancel();
	    			                    }
	    			                });
	    			AlertDialog alert = builder.create();
	    			alert.show();
	    			return;
	    			
	    		}
	    		
	    	}
	    	this.jugador=1;
	    	juegaCpu();
	    	
	 }
	    else if (this.jugador==1){
	    	this.casilla10="0";
			this.E2.setBackgroundResource(R.drawable.circulo);
	    	this.E2.setClickable(false);
	    	int fin= this.juegoAcabado();
	    	if(fin!=-1){
	    		if(fin==1){
	    			
	    			this.ventanaFin.getText();
	    				 mensaje="Ganan los Circulos";
	    				 titulo="Juego Acabado";
	    				 aceptar="Aceptar";
	    			
	    			
	    			AlertDialog.Builder builder = new AlertDialog.Builder(this);
	    			builder.setMessage(mensaje)
	    			        .setTitle(titulo)
	    			        .setCancelable(false)
	    			        .setNeutralButton(aceptar,
	    			                new DialogInterface.OnClickListener() {
	    			                    public void onClick(DialogInterface dialog, int id) {
	    			                        dialog.cancel();
	    			                    }
	    			                });
	    			AlertDialog alert = builder.create();
	    			alert.show();
	    			
	    		}
	    		
	    		else if(fin==2){
	    			
	    			this.ventanaFin.getText();
	       				 mensaje="Han Empatado";
	       				 titulo="Juego Acabado";
	       				 aceptar="Aceptar";
	       			
	    			
	    			AlertDialog.Builder builder = new AlertDialog.Builder(this);
	    			builder.setMessage(mensaje)
	    			        .setTitle(titulo)
	    			        .setCancelable(false)
	    			        .setNeutralButton(aceptar,
	    			                new DialogInterface.OnClickListener() {
	    			                    public void onClick(DialogInterface dialog, int id) {
	    			                        dialog.cancel();
	    			                    }
	    			                });
	    			AlertDialog alert = builder.create();
	    			alert.show();
	    			
	    		}
	    		
	    	}
	    	this.jugador=0;
	    	
	    }

	} 
	//-----------------------------------------------------------
	//-----------------------------------------------------------	
//	------------------------------------------------------
	public void pulsax11(View view){
	    
		mp.start();
		
		if(this.jugador==0 && view.isClickable()){
			this.casilla11="X";
			this.A3.setBackgroundResource(R.drawable.cruz);
        	this.A3.setClickable(false);
        	
        	int fin= this.juegoAcabado();
        	if(fin!=-1){
        		if(fin==0){
        			
        		this.ventanaFin.getText();
        				 mensaje="Ganan las Cruces";
        				 titulo="Juego Acabado";
        				 aceptar="Aceptar";
        			
        			
        			AlertDialog.Builder builder = new AlertDialog.Builder(this);
        			builder.setMessage(mensaje)
        			        .setTitle(titulo)
        			        .setCancelable(false)
        			        .setNeutralButton(aceptar,
        			                new DialogInterface.OnClickListener() {
        			                    public void onClick(DialogInterface dialog, int id) {
        			                        dialog.cancel();
        			                    }
        			                });
        			AlertDialog alert = builder.create();
        			alert.show();
        			return;
        			
        		}
        		
        		else if(fin==2){
        			
        			this.ventanaFin.getText();
	       				 mensaje="Han Empatado";
	       				 titulo="Juego Acabado";
	       				 aceptar="Aceptar";
	       			
        			
        			AlertDialog.Builder builder = new AlertDialog.Builder(this);
        			builder.setMessage(mensaje)
        			        .setTitle(titulo)
        			        .setCancelable(false)
        			        .setNeutralButton(aceptar,
        			                new DialogInterface.OnClickListener() {
        			                    public void onClick(DialogInterface dialog, int id) {
        			                        dialog.cancel();
        			                    }
        			                });
        			AlertDialog alert = builder.create();
        			alert.show();
        			return;
        			
        		}
        		
        	}
        	this.jugador=1;
        	juegaCpu();
        	
	 }
        else if (this.jugador==1){
        	this.casilla11="0";
			this.A3.setBackgroundResource(R.drawable.circulo);
        	this.A3.setClickable(false);
        	int fin= this.juegoAcabado();
        	if(fin!=-1){
        		if(fin==1){
        			
        			this.ventanaFin.getText();
        				 mensaje="Ganan los Circulos";
        				 titulo="Juego Acabado";
        				 aceptar="Aceptar";
        			
        			
        			AlertDialog.Builder builder = new AlertDialog.Builder(this);
        			builder.setMessage(mensaje)
        			        .setTitle(titulo)
        			        .setCancelable(false)
        			        .setNeutralButton(aceptar,
        			                new DialogInterface.OnClickListener() {
        			                    public void onClick(DialogInterface dialog, int id) {
        			                        dialog.cancel();
        			                    }
        			                });
        			AlertDialog alert = builder.create();
        			alert.show();
        			
        		}
        		
        		else if(fin==2){
        			
        			this.ventanaFin.getText();
	       				 mensaje="Han Empatado";
	       				 titulo="Juego Acabado";
	       				 aceptar="Aceptar";
	       			
        			
        			AlertDialog.Builder builder = new AlertDialog.Builder(this);
        			builder.setMessage(mensaje)
        			        .setTitle(titulo)
        			        .setCancelable(false)
        			        .setNeutralButton(aceptar,
        			                new DialogInterface.OnClickListener() {
        			                    public void onClick(DialogInterface dialog, int id) {
        			                        dialog.cancel();
        			                    }
        			                });
        			AlertDialog alert = builder.create();
        			alert.show();
        			
        		}
        		
        	}
        	this.jugador=0;
        	
        }

	
	} 
//	----------------------------------------------------
	public void pulsax12(View view){
	    
		mp.start();
		
		if(this.jugador==0 && view.isClickable()){
			this.casilla12="X";
			this.B3.setBackgroundResource(R.drawable.cruz);
        	this.B3.setClickable(false);
        	
        	int fin= this.juegoAcabado();
        	if(fin!=-1){
        		if(fin==0){
        			
        			this.ventanaFin.getText();
        				 mensaje="Ganan las Cruces";
        				 titulo="Juego Acabado";
        				 aceptar="Aceptar";
        			
        			
        			AlertDialog.Builder builder = new AlertDialog.Builder(this);
        			builder.setMessage(mensaje)
        			        .setTitle(titulo)
        			        .setCancelable(false)
        			        .setNeutralButton(aceptar,
        			                new DialogInterface.OnClickListener() {
        			                    public void onClick(DialogInterface dialog, int id) {
        			                        dialog.cancel();
        			                    }
        			                });
        			AlertDialog alert = builder.create();
        			alert.show();
        			return;
        			
        		}
        		
        		else if(fin==2){
        			
        		this.ventanaFin.getText();
	       				 mensaje="Han Empatado";
	       				 titulo="Juego Acabado";
	       				 aceptar="Aceptar";
	       			
        			
        			AlertDialog.Builder builder = new AlertDialog.Builder(this);
        			builder.setMessage(mensaje)
        			        .setTitle(titulo)
        			        .setCancelable(false)
        			        .setNeutralButton(aceptar,
        			                new DialogInterface.OnClickListener() {
        			                    public void onClick(DialogInterface dialog, int id) {
        			                        dialog.cancel();
        			                    }
        			                });
        			AlertDialog alert = builder.create();
        			alert.show();
        			return;
        			
        		}
        		
        	}
        	this.jugador=1;
        	juegaCpu();
        	
	 }
        else if (this.jugador==1){
        	this.casilla12="0";
			this.B3.setBackgroundResource(R.drawable.circulo);
        	this.B3.setClickable(false);
        	int fin= this.juegoAcabado();
        	if(fin!=-1){
        		if(fin==1){
        			this.ventanaFin.getText();
        				 mensaje="Ganan los Circulos";
        				 titulo="Juego Acabado";
        				 aceptar="Aceptar";
        			
        			
        			AlertDialog.Builder builder = new AlertDialog.Builder(this);
        			builder.setMessage(mensaje)
        			        .setTitle(titulo)
        			        .setCancelable(false)
        			        .setNeutralButton(aceptar,
        			                new DialogInterface.OnClickListener() {
        			                    public void onClick(DialogInterface dialog, int id) {
        			                        dialog.cancel();
        			                    }
        			                });
        			AlertDialog alert = builder.create();
        			alert.show();
        			
        		}
        		
        		else if(fin==2){
        			
        			this.ventanaFin.getText();
	       				 mensaje="Han Empatado";
	       				 titulo="Juego Acabado";
	       				 aceptar="Aceptar";
	       			
        			
        			AlertDialog.Builder builder = new AlertDialog.Builder(this);
        			builder.setMessage(mensaje)
        			        .setTitle(titulo)
        			        .setCancelable(false)
        			        .setNeutralButton(aceptar,
        			                new DialogInterface.OnClickListener() {
        			                    public void onClick(DialogInterface dialog, int id) {
        			                        dialog.cancel();
        			                    }
        			                });
        			AlertDialog alert = builder.create();
        			alert.show();
        			
        		}
        		
        	}
        	this.jugador=0;
        	
        }

	
	} 
	//---------------------------------------
	
	public void pulsax13(View view){
	    
		mp.start();
		
		if(this.jugador==0 && view.isClickable()){
			this.casilla13="X";
			this.C3.setBackgroundResource(R.drawable.cruz);
	    	this.C3.setClickable(false);
	    	
	    	int fin= this.juegoAcabado();
	    	if(fin!=-1){
	    		if(fin==0){
	    			
	    			this.ventanaFin.getText();
	    				 mensaje="Ganan las Cruces";
	    				 titulo="Juego Acabado";
	    				 aceptar="Aceptar";
	    			
	    			
	    			AlertDialog.Builder builder = new AlertDialog.Builder(this);
	    			builder.setMessage(mensaje)
	    			        .setTitle(titulo)
	    			        .setCancelable(false)
	    			        .setNeutralButton(aceptar,
	    			                new DialogInterface.OnClickListener() {
	    			                    public void onClick(DialogInterface dialog, int id) {
	    			                        dialog.cancel();
	    			                    }
	    			                });
	    			AlertDialog alert = builder.create();
	    			alert.show();
	    			return;
	    			
	    		}
	    		
	    		else if(fin==2){
	    			
	    			this.ventanaFin.getText();
	       				 mensaje="Han Empatado";
	       				 titulo="Juego Acabado";
	       				 aceptar="Aceptar";
	       			
	    			
	    			AlertDialog.Builder builder = new AlertDialog.Builder(this);
	    			builder.setMessage(mensaje)
	    			        .setTitle(titulo)
	    			        .setCancelable(false)
	    			        .setNeutralButton(aceptar,
	    			                new DialogInterface.OnClickListener() {
	    			                    public void onClick(DialogInterface dialog, int id) {
	    			                        dialog.cancel();
	    			                    }
	    			                });
	    			AlertDialog alert = builder.create();
	    			alert.show();
	    			return;
	    			
	    		}
	    		
	    	}
	    	this.jugador=1;
	    	juegaCpu();
	    	
	 }
	    else if (this.jugador==1){
	    	this.casilla13="0";
			this.C3.setBackgroundResource(R.drawable.circulo);
	    	this.C3.setClickable(false);
	    	int fin= this.juegoAcabado();
	    	if(fin!=-1){
	    		if(fin==1){
	    			
	    			this.ventanaFin.getText();
	    				 mensaje="Ganan los Circulos";
	    				 titulo="Juego Acabado";
	    				 aceptar="Aceptar";
	    			
	    			
	    			AlertDialog.Builder builder = new AlertDialog.Builder(this);
	    			builder.setMessage(mensaje)
	    			        .setTitle(titulo)
	    			        .setCancelable(false)
	    			        .setNeutralButton(aceptar,
	    			                new DialogInterface.OnClickListener() {
	    			                    public void onClick(DialogInterface dialog, int id) {
	    			                        dialog.cancel();
	    			                    }
	    			                });
	    			AlertDialog alert = builder.create();
	    			alert.show();
	    			
	    		}
	    		
	    		else if(fin==2){
	    			
	    			this.ventanaFin.getText();
	       				 mensaje="Han Empatado";
	       				 titulo="Juego Acabado";
	       				 aceptar="Aceptar";
	       			
	    			
	    			AlertDialog.Builder builder = new AlertDialog.Builder(this);
	    			builder.setMessage(mensaje)
	    			        .setTitle(titulo)
	    			        .setCancelable(false)
	    			        .setNeutralButton(aceptar,
	    			                new DialogInterface.OnClickListener() {
	    			                    public void onClick(DialogInterface dialog, int id) {
	    			                        dialog.cancel();
	    			                    }
	    			                });
	    			AlertDialog alert = builder.create();
	    			alert.show();
	    			
	    		}
	    		
	    	}
	    	this.jugador=0;
	    	
	    }

	} 
	
	//---------------------------------------
	
	public void pulsax14(View view){
	    
		mp.start();
		
		if(this.jugador==0 && view.isClickable()){
			this.casilla14="X";
			this.D3.setBackgroundResource(R.drawable.cruz);
	    	this.D3.setClickable(false);
	    	
	    	int fin= this.juegoAcabado();
	    	if(fin!=-1){
	    		if(fin==0){
	    			
	    			this.ventanaFin.getText();
	    				 mensaje="Ganan las Cruces";
	    				 titulo="Juego Acabado";
	    				 aceptar="Aceptar";
	    			
	    			
	    			AlertDialog.Builder builder = new AlertDialog.Builder(this);
	    			builder.setMessage(mensaje)
	    			        .setTitle(titulo)
	    			        .setCancelable(false)
	    			        .setNeutralButton(aceptar,
	    			                new DialogInterface.OnClickListener() {
	    			                    public void onClick(DialogInterface dialog, int id) {
	    			                        dialog.cancel();
	    			                    }
	    			                });
	    			AlertDialog alert = builder.create();
	    			alert.show();
	    			return;
	    			
	    		}
	    		
	    		else if(fin==2){
	    			
	    			this.ventanaFin.getText();
	       				 mensaje="Han Empatado";
	       				 titulo="Juego Acabado";
	       				 aceptar="Aceptar";
	       			
	    			
	    			AlertDialog.Builder builder = new AlertDialog.Builder(this);
	    			builder.setMessage(mensaje)
	    			        .setTitle(titulo)
	    			        .setCancelable(false)
	    			        .setNeutralButton(aceptar,
	    			                new DialogInterface.OnClickListener() {
	    			                    public void onClick(DialogInterface dialog, int id) {
	    			                        dialog.cancel();
	    			                    }
	    			                });
	    			AlertDialog alert = builder.create();
	    			alert.show();
	    			return;
	    			
	    		}
	    		
	    	}
	    	this.jugador=1;
	    	juegaCpu();
	    	
	 }
	    else if (this.jugador==1){
	    	this.casilla14="0";
			this.D3.setBackgroundResource(R.drawable.circulo);
	    	this.D3.setClickable(false);
	    	int fin= this.juegoAcabado();
	    	if(fin!=-1){
	    		if(fin==1){
	    			
	    			this.ventanaFin.getText();
	    				 mensaje="Ganan los Circulos";
	    				 titulo="Juego Acabado";
	    				 aceptar="Aceptar";
	    			
	    			
	    			AlertDialog.Builder builder = new AlertDialog.Builder(this);
	    			builder.setMessage(mensaje)
	    			        .setTitle(titulo)
	    			        .setCancelable(false)
	    			        .setNeutralButton(aceptar,
	    			                new DialogInterface.OnClickListener() {
	    			                    public void onClick(DialogInterface dialog, int id) {
	    			                        dialog.cancel();
	    			                    }
	    			                });
	    			AlertDialog alert = builder.create();
	    			alert.show();
	    			
	    		}
	    		
	    		else if(fin==2){
	    			
	    			this.ventanaFin.getText();
	       				 mensaje="Han Empatado";
	       				 titulo="Juego Acabado";
	       				 aceptar="Aceptar";
	       			
	    			
	    			AlertDialog.Builder builder = new AlertDialog.Builder(this);
	    			builder.setMessage(mensaje)
	    			        .setTitle(titulo)
	    			        .setCancelable(false)
	    			        .setNeutralButton(aceptar,
	    			                new DialogInterface.OnClickListener() {
	    			                    public void onClick(DialogInterface dialog, int id) {
	    			                        dialog.cancel();
	    			                    }
	    			                });
	    			AlertDialog alert = builder.create();
	    			alert.show();
	    			
	    		}
	    		
	    	}
	    	this.jugador=0;
	    	
	    }

	} 
	//-----------------------------------------------------------	
	//-----------------------------------------------------------	
	
	
	public void pulsax15(View view){
		 
		mp.start();
		
		if(this.jugador==0 && view.isClickable()){
			this.casilla15="X";
			this.E3.setBackgroundResource(R.drawable.cruz);
        	this.E3.setClickable(false);
        	
        	int fin= this.juegoAcabado();
        	if(fin!=-1){
        		if(fin==0){
        			
        			this.ventanaFin.getText();
        				 mensaje="Ganan las Cruces";
        				 titulo="Juego Acabado";
        				 aceptar="Aceptar";
        			
        			
        			AlertDialog.Builder builder = new AlertDialog.Builder(this);
        			builder.setMessage(mensaje)
        			        .setTitle(titulo)
        			        .setCancelable(false)
        			        .setNeutralButton(aceptar,
        			                new DialogInterface.OnClickListener() {
        			                    public void onClick(DialogInterface dialog, int id) {
        			                        dialog.cancel();
        			                    }
        			                });
        			AlertDialog alert = builder.create();
        			alert.show();
        			return;
        			
        		}
        		
        		else if(fin==2){
        			
        			this.ventanaFin.getText();
	       				 mensaje="Han Empatado";
	       				 titulo="Juego Acabado";
	       				 aceptar="Aceptar";
	       			
        			
        			AlertDialog.Builder builder = new AlertDialog.Builder(this);
        			builder.setMessage(mensaje)
        			        .setTitle(titulo)
        			        .setCancelable(false)
        			        .setNeutralButton(aceptar,
        			                new DialogInterface.OnClickListener() {
        			                    public void onClick(DialogInterface dialog, int id) {
        			                        dialog.cancel();
        			                    }
        			                });
        			AlertDialog alert = builder.create();
        			alert.show();
        			return;
        			
        		}
        		
        	}
        	this.jugador=1;
        	juegaCpu();
        	
	 }
        else if (this.jugador==1){
        	this.casilla15="0";
			this.E3.setBackgroundResource(R.drawable.circulo);
        	this.E3.setClickable(false);
        	int fin= this.juegoAcabado();
        	if(fin!=-1){
        		if(fin==1){
        			
        			this.ventanaFin.getText();
        				 mensaje="Ganan los Circulos";
        				 titulo="Juego Acabado";
        				 aceptar="Aceptar";
        			
        			
        			AlertDialog.Builder builder = new AlertDialog.Builder(this);
        			builder.setMessage(mensaje)
        			        .setTitle(titulo)
        			        .setCancelable(false)
        			        .setNeutralButton(aceptar,
        			                new DialogInterface.OnClickListener() {
        			                    public void onClick(DialogInterface dialog, int id) {
        			                        dialog.cancel();
        			                    }
        			                });
        			AlertDialog alert = builder.create();
        			alert.show();
        			
        		}
        		
        		else if(fin==2){
        			
        			this.ventanaFin.getText();
	       				 mensaje="Han Empatado";
	       				 titulo="Juego Acabado";
	       				 aceptar="Aceptar";
	       			
        			
        			AlertDialog.Builder builder = new AlertDialog.Builder(this);
        			builder.setMessage(mensaje)
        			        .setTitle(titulo)
        			        .setCancelable(false)
        			        .setNeutralButton(aceptar,
        			                new DialogInterface.OnClickListener() {
        			                    public void onClick(DialogInterface dialog, int id) {
        			                        dialog.cancel();
        			                    }
        			                });
        			AlertDialog alert = builder.create();
        			alert.show();
        			
        		}
        		
        	}
        	this.jugador=0;
        	
        }

	
	} 
//	--------------------------------
	//-----------------------------------------------------------	
	
	
	public void pulsax16(View view){
		 
		mp.start();
		
		if(this.jugador==0 && view.isClickable()){
			this.casilla16="X";
			this.A4.setBackgroundResource(R.drawable.cruz);
        	this.A4.setClickable(false);
        	
        	int fin= this.juegoAcabado();
        	if(fin!=-1){
        		if(fin==0){
        			
        			this.ventanaFin.getText();
        				 mensaje="Ganan las Cruces";
        				 titulo="Juego Acabado";
        				 aceptar="Aceptar";
        			
        			
        			AlertDialog.Builder builder = new AlertDialog.Builder(this);
        			builder.setMessage(mensaje)
        			        .setTitle(titulo)
        			        .setCancelable(false)
        			        .setNeutralButton(aceptar,
        			                new DialogInterface.OnClickListener() {
        			                    public void onClick(DialogInterface dialog, int id) {
        			                        dialog.cancel();
        			                    }
        			                });
        			AlertDialog alert = builder.create();
        			alert.show();
        			return;
        			
        		}
        		
        		else if(fin==2){
        			
        			this.ventanaFin.getText();
	       				 mensaje="Han Empatado";
	       				 titulo="Juego Acabado";
	       				 aceptar="Aceptar";
	       			
        			
        			AlertDialog.Builder builder = new AlertDialog.Builder(this);
        			builder.setMessage(mensaje)
        			        .setTitle(titulo)
        			        .setCancelable(false)
        			        .setNeutralButton(aceptar,
        			                new DialogInterface.OnClickListener() {
        			                    public void onClick(DialogInterface dialog, int id) {
        			                        dialog.cancel();
        			                    }
        			                });
        			AlertDialog alert = builder.create();
        			alert.show();
        			return;
        			
        		}
        		
        	}
        	this.jugador=1;
        	juegaCpu();
        	
	 }
        else if (this.jugador==1){
        	this.casilla16="0";
			this.A4.setBackgroundResource(R.drawable.circulo);
        	this.A4.setClickable(false);
        	int fin= this.juegoAcabado();
        	if(fin!=-1){
        		if(fin==1){
        			
        			this.ventanaFin.getText();
        				 mensaje="Ganan los Circulos";
        				 titulo="Juego Acabado";
        				 aceptar="Aceptar";
        			
        			
        			AlertDialog.Builder builder = new AlertDialog.Builder(this);
        			builder.setMessage(mensaje)
        			        .setTitle(titulo)
        			        .setCancelable(false)
        			        .setNeutralButton(aceptar,
        			                new DialogInterface.OnClickListener() {
        			                    public void onClick(DialogInterface dialog, int id) {
        			                        dialog.cancel();
        			                    }
        			                });
        			AlertDialog alert = builder.create();
        			alert.show();
        			
        		}
        		
        		else if(fin==2){
        			
        			this.ventanaFin.getText();
	       				 mensaje="Han Empatado";
	       				 titulo="Juego Acabado";
	       				 aceptar="Aceptar";
	       			
        			
        			AlertDialog.Builder builder = new AlertDialog.Builder(this);
        			builder.setMessage(mensaje)
        			        .setTitle(titulo)
        			        .setCancelable(false)
        			        .setNeutralButton(aceptar,
        			                new DialogInterface.OnClickListener() {
        			                    public void onClick(DialogInterface dialog, int id) {
        			                        dialog.cancel();
        			                    }
        			                });
        			AlertDialog alert = builder.create();
        			alert.show();
        			
        		}
        		
        	}
        	this.jugador=0;
        	
        }

	
	}
	
	//-----------------------------------------------------------	
	
	
	public void pulsax17(View view){
		 
		mp.start();
		
		if(this.jugador==0 && view.isClickable()){
			this.casilla17="X";
			this.B4.setBackgroundResource(R.drawable.cruz);
        	this.B4.setClickable(false);
        	
        	int fin= this.juegoAcabado();
        	if(fin!=-1){
        		if(fin==0){
        			
        			this.ventanaFin.getText();
        				 mensaje="Ganan las Cruces";
        				 titulo="Juego Acabado";
        				 aceptar="Aceptar";
        			
        			
        			AlertDialog.Builder builder = new AlertDialog.Builder(this);
        			builder.setMessage(mensaje)
        			        .setTitle(titulo)
        			        .setCancelable(false)
        			        .setNeutralButton(aceptar,
        			                new DialogInterface.OnClickListener() {
        			                    public void onClick(DialogInterface dialog, int id) {
        			                        dialog.cancel();
        			                    }
        			                });
        			AlertDialog alert = builder.create();
        			alert.show();
        			return;
        			
        		}
        		
        		else if(fin==2){
        			
        			this.ventanaFin.getText();
	       				 mensaje="Han Empatado";
	       				 titulo="Juego Acabado";
	       				 aceptar="Aceptar";
	       			
        			
        			AlertDialog.Builder builder = new AlertDialog.Builder(this);
        			builder.setMessage(mensaje)
        			        .setTitle(titulo)
        			        .setCancelable(false)
        			        .setNeutralButton(aceptar,
        			                new DialogInterface.OnClickListener() {
        			                    public void onClick(DialogInterface dialog, int id) {
        			                        dialog.cancel();
        			                    }
        			                });
        			AlertDialog alert = builder.create();
        			alert.show();
        			return;
        			
        		}
        		
        	}
        	this.jugador=1;
        	juegaCpu();
        	
	 }
        else if (this.jugador==1){
        	this.casilla17="0";
			this.B4.setBackgroundResource(R.drawable.circulo);
        	this.B4.setClickable(false);
        	int fin= this.juegoAcabado();
        	if(fin!=-1){
        		if(fin==1){
        			
        			this.ventanaFin.getText();
        				 mensaje="Ganan los Circulos";
        				 titulo="Juego Acabado";
        				 aceptar="Aceptar";
        			
        			
        			AlertDialog.Builder builder = new AlertDialog.Builder(this);
        			builder.setMessage(mensaje)
        			        .setTitle(titulo)
        			        .setCancelable(false)
        			        .setNeutralButton(aceptar,
        			                new DialogInterface.OnClickListener() {
        			                    public void onClick(DialogInterface dialog, int id) {
        			                        dialog.cancel();
        			                    }
        			                });
        			AlertDialog alert = builder.create();
        			alert.show();
        			
        		}
        		
        		else if(fin==2){
        			
        			this.ventanaFin.getText();
	       				 mensaje="Han Empatado";
	       				 titulo="Juego Acabado";
	       				 aceptar="Aceptar";
	       			
        			
        			AlertDialog.Builder builder = new AlertDialog.Builder(this);
        			builder.setMessage(mensaje)
        			        .setTitle(titulo)
        			        .setCancelable(false)
        			        .setNeutralButton(aceptar,
        			                new DialogInterface.OnClickListener() {
        			                    public void onClick(DialogInterface dialog, int id) {
        			                        dialog.cancel();
        			                    }
        			                });
        			AlertDialog alert = builder.create();
        			alert.show();
        			
        		}
        		
        	}
        	this.jugador=0;
        	
        }

	
	}
	//-----------------------------------------------------------	
	
	
	public void pulsax18(View view){
		 
		mp.start();
		
		if(this.jugador==0 && view.isClickable()){
			this.casilla18="X";
			this.C4.setBackgroundResource(R.drawable.cruz);
        	this.C4.setClickable(false);
        	
        	int fin= this.juegoAcabado();
        	if(fin!=-1){
        		if(fin==0){
        			
        			this.ventanaFin.getText();
        				 mensaje="Ganan las Cruces";
        				 titulo="Juego Acabado";
        				 aceptar="Aceptar";
        			
        			
        			AlertDialog.Builder builder = new AlertDialog.Builder(this);
        			builder.setMessage(mensaje)
        			        .setTitle(titulo)
        			        .setCancelable(false)
        			        .setNeutralButton(aceptar,
        			                new DialogInterface.OnClickListener() {
        			                    public void onClick(DialogInterface dialog, int id) {
        			                        dialog.cancel();
        			                    }
        			                });
        			AlertDialog alert = builder.create();
        			alert.show();
        			return;
        			
        		}
        		
        		else if(fin==2){
        			
        			this.ventanaFin.getText();
	       				 mensaje="Han Empatado";
	       				 titulo="Juego Acabado";
	       				 aceptar="Aceptar";
	       			
        			
        			AlertDialog.Builder builder = new AlertDialog.Builder(this);
        			builder.setMessage(mensaje)
        			        .setTitle(titulo)
        			        .setCancelable(false)
        			        .setNeutralButton(aceptar,
        			                new DialogInterface.OnClickListener() {
        			                    public void onClick(DialogInterface dialog, int id) {
        			                        dialog.cancel();
        			                    }
        			                });
        			AlertDialog alert = builder.create();
        			alert.show();
        			return;
        			
        		}
        		
        	}
        	this.jugador=1;
        	juegaCpu();
        	
	 }
        else if (this.jugador==1){
        	this.casilla18="0";
			this.C4.setBackgroundResource(R.drawable.circulo);
        	this.C4.setClickable(false);
        	int fin= this.juegoAcabado();
        	if(fin!=-1){
        		if(fin==1){
        			
        			this.ventanaFin.getText();
        				 mensaje="Ganan los Circulos";
        				 titulo="Juego Acabado";
        				 aceptar="Aceptar";
        			
        			
        			AlertDialog.Builder builder = new AlertDialog.Builder(this);
        			builder.setMessage(mensaje)
        			        .setTitle(titulo)
        			        .setCancelable(false)
        			        .setNeutralButton(aceptar,
        			                new DialogInterface.OnClickListener() {
        			                    public void onClick(DialogInterface dialog, int id) {
        			                        dialog.cancel();
        			                    }
        			                });
        			AlertDialog alert = builder.create();
        			alert.show();
        			
        		}
        		
        		else if(fin==2){
        			
        			this.ventanaFin.getText();
	       				 mensaje="Han Empatado";
	       				 titulo="Juego Acabado";
	       				 aceptar="Aceptar";
	       			
        			
        			AlertDialog.Builder builder = new AlertDialog.Builder(this);
        			builder.setMessage(mensaje)
        			        .setTitle(titulo)
        			        .setCancelable(false)
        			        .setNeutralButton(aceptar,
        			                new DialogInterface.OnClickListener() {
        			                    public void onClick(DialogInterface dialog, int id) {
        			                        dialog.cancel();
        			                    }
        			                });
        			AlertDialog alert = builder.create();
        			alert.show();
        			
        		}
        		
        	}
        	this.jugador=0;
        	
        }

	
	}
	//-----------------------------------------------------------	
	
	
	public void pulsax19(View view){
		 
		mp.start();
		
		if(this.jugador==0 && view.isClickable()){
			this.casilla19="X";
			this.D4.setBackgroundResource(R.drawable.cruz);
        	this.D4.setClickable(false);
        	
        	int fin= this.juegoAcabado();
        	if(fin!=-1){
        		if(fin==0){
        			
        			this.ventanaFin.getText();
        				 mensaje="Ganan las Cruces";
        				 titulo="Juego Acabado";
        				 aceptar="Aceptar";
        			
        			
        			AlertDialog.Builder builder = new AlertDialog.Builder(this);
        			builder.setMessage(mensaje)
        			        .setTitle(titulo)
        			        .setCancelable(false)
        			        .setNeutralButton(aceptar,
        			                new DialogInterface.OnClickListener() {
        			                    public void onClick(DialogInterface dialog, int id) {
        			                        dialog.cancel();
        			                    }
        			                });
        			AlertDialog alert = builder.create();
        			alert.show();
        			return;
        			
        		}
        		
        		else if(fin==2){
        			
        			this.ventanaFin.getText();
	       				 mensaje="Han Empatado";
	       				 titulo="Juego Acabado";
	       				 aceptar="Aceptar";
	       			
        			
        			AlertDialog.Builder builder = new AlertDialog.Builder(this);
        			builder.setMessage(mensaje)
        			        .setTitle(titulo)
        			        .setCancelable(false)
        			        .setNeutralButton(aceptar,
        			                new DialogInterface.OnClickListener() {
        			                    public void onClick(DialogInterface dialog, int id) {
        			                        dialog.cancel();
        			                    }
        			                });
        			AlertDialog alert = builder.create();
        			alert.show();
        			return;
        			
        		}
        		
        	}
        	this.jugador=1;
        	juegaCpu();
        	
	 }
        else if (this.jugador==1){
        	this.casilla19="0";
			this.D4.setBackgroundResource(R.drawable.circulo);
        	this.D4.setClickable(false);
        	int fin= this.juegoAcabado();
        	if(fin!=-1){
        		if(fin==1){
        			
        			this.ventanaFin.getText();
        				 mensaje="Ganan los Circulos";
        				 titulo="Juego Acabado";
        				 aceptar="Aceptar";
        			
        			
        			AlertDialog.Builder builder = new AlertDialog.Builder(this);
        			builder.setMessage(mensaje)
        			        .setTitle(titulo)
        			        .setCancelable(false)
        			        .setNeutralButton(aceptar,
        			                new DialogInterface.OnClickListener() {
        			                    public void onClick(DialogInterface dialog, int id) {
        			                        dialog.cancel();
        			                    }
        			                });
        			AlertDialog alert = builder.create();
        			alert.show();
        			
        		}
        		
        		else if(fin==2){
        			
        			this.ventanaFin.getText();
	       				 mensaje="Han Empatado";
	       				 titulo="Juego Acabado";
	       				 aceptar="Aceptar";
	       			
        			
        			AlertDialog.Builder builder = new AlertDialog.Builder(this);
        			builder.setMessage(mensaje)
        			        .setTitle(titulo)
        			        .setCancelable(false)
        			        .setNeutralButton(aceptar,
        			                new DialogInterface.OnClickListener() {
        			                    public void onClick(DialogInterface dialog, int id) {
        			                        dialog.cancel();
        			                    }
        			                });
        			AlertDialog alert = builder.create();
        			alert.show();
        			
        		}
        		
        	}
        	this.jugador=0;
        	
        }

	
	}
	//-----------------------------------------------------------	
	
	
	public void pulsax20(View view){
		 
		mp.start();
		
		if(this.jugador==0 && view.isClickable()){
			this.casilla20="X";
			this.E4.setBackgroundResource(R.drawable.cruz);
        	this.E4.setClickable(false);
        	
        	int fin= this.juegoAcabado();
        	if(fin!=-1){
        		if(fin==0){
        			
        			this.ventanaFin.getText();
        				 mensaje="Ganan las Cruces";
        				 titulo="Juego Acabado";
        				 aceptar="Aceptar";
        			
        			
        			AlertDialog.Builder builder = new AlertDialog.Builder(this);
        			builder.setMessage(mensaje)
        			        .setTitle(titulo)
        			        .setCancelable(false)
        			        .setNeutralButton(aceptar,
        			                new DialogInterface.OnClickListener() {
        			                    public void onClick(DialogInterface dialog, int id) {
        			                        dialog.cancel();
        			                    }
        			                });
        			AlertDialog alert = builder.create();
        			alert.show();
        			return;
        			
        		}
        		
        		else if(fin==2){
        			
        			this.ventanaFin.getText();
	       				 mensaje="Han Empatado";
	       				 titulo="Juego Acabado";
	       				 aceptar="Aceptar";
	       			
        			
        			AlertDialog.Builder builder = new AlertDialog.Builder(this);
        			builder.setMessage(mensaje)
        			        .setTitle(titulo)
        			        .setCancelable(false)
        			        .setNeutralButton(aceptar,
        			                new DialogInterface.OnClickListener() {
        			                    public void onClick(DialogInterface dialog, int id) {
        			                        dialog.cancel();
        			                    }
        			                });
        			AlertDialog alert = builder.create();
        			alert.show();
        			return;
        			
        		}
        		
        	}
        	this.jugador=1;
        	juegaCpu();
        	
	 }
        else if (this.jugador==1){
        	this.casilla20="0";
			this.E4.setBackgroundResource(R.drawable.circulo);
        	this.E4.setClickable(false);
        	int fin= this.juegoAcabado();
        	if(fin!=-1){
        		if(fin==1){
        			
        			this.ventanaFin.getText();
        				 mensaje="Ganan los Circulos";
        				 titulo="Juego Acabado";
        				 aceptar="Aceptar";
        			
        			
        			AlertDialog.Builder builder = new AlertDialog.Builder(this);
        			builder.setMessage(mensaje)
        			        .setTitle(titulo)
        			        .setCancelable(false)
        			        .setNeutralButton(aceptar,
        			                new DialogInterface.OnClickListener() {
        			                    public void onClick(DialogInterface dialog, int id) {
        			                        dialog.cancel();
        			                    }
        			                });
        			AlertDialog alert = builder.create();
        			alert.show();
        			
        		}
        		
        		else if(fin==2){
        			
        			this.ventanaFin.getText();
	       				 mensaje="Han Empatado";
	       				 titulo="Juego Acabado";
	       				 aceptar="Aceptar";
	       			
        			
        			AlertDialog.Builder builder = new AlertDialog.Builder(this);
        			builder.setMessage(mensaje)
        			        .setTitle(titulo)
        			        .setCancelable(false)
        			        .setNeutralButton(aceptar,
        			                new DialogInterface.OnClickListener() {
        			                    public void onClick(DialogInterface dialog, int id) {
        			                        dialog.cancel();
        			                    }
        			                });
        			AlertDialog alert = builder.create();
        			alert.show();
        			
        		}
        		
        	}
        	this.jugador=0;
        	
        }

	
	}
	//-----------------------------------------------------------	
	
	
	public void pulsax21(View view){
		 
		mp.start();
		
		if(this.jugador==0 && view.isClickable()){
			this.casilla21="X";
			this.A5.setBackgroundResource(R.drawable.cruz);
        	this.A5.setClickable(false);
        	
        	int fin= this.juegoAcabado();
        	if(fin!=-1){
        		if(fin==0){
        			
        			this.ventanaFin.getText();
        				 mensaje="Ganan las Cruces";
        				 titulo="Juego Acabado";
        				 aceptar="Aceptar";
        			
        			
        			AlertDialog.Builder builder = new AlertDialog.Builder(this);
        			builder.setMessage(mensaje)
        			        .setTitle(titulo)
        			        .setCancelable(false)
        			        .setNeutralButton(aceptar,
        			                new DialogInterface.OnClickListener() {
        			                    public void onClick(DialogInterface dialog, int id) {
        			                        dialog.cancel();
        			                    }
        			                });
        			AlertDialog alert = builder.create();
        			alert.show();
        			return;
        			
        		}
        		
        		else if(fin==2){
        			
        			this.ventanaFin.getText();
	       				 mensaje="Han Empatado";
	       				 titulo="Juego Acabado";
	       				 aceptar="Aceptar";
	       			
        			
        			AlertDialog.Builder builder = new AlertDialog.Builder(this);
        			builder.setMessage(mensaje)
        			        .setTitle(titulo)
        			        .setCancelable(false)
        			        .setNeutralButton(aceptar,
        			                new DialogInterface.OnClickListener() {
        			                    public void onClick(DialogInterface dialog, int id) {
        			                        dialog.cancel();
        			                    }
        			                });
        			AlertDialog alert = builder.create();
        			alert.show();
        			return;
        			
        		}
        		
        	}
        	this.jugador=1;
        	juegaCpu();
        	
	 }
        else if (this.jugador==1){
        	this.casilla21="0";
			this.A5.setBackgroundResource(R.drawable.circulo);
        	this.A5.setClickable(false);
        	int fin= this.juegoAcabado();
        	if(fin!=-1){
        		if(fin==1){
        			
        			this.ventanaFin.getText();
        				 mensaje="Ganan los Circulos";
        				 titulo="Juego Acabado";
        				 aceptar="Aceptar";
        			
        			
        			AlertDialog.Builder builder = new AlertDialog.Builder(this);
        			builder.setMessage(mensaje)
        			        .setTitle(titulo)
        			        .setCancelable(false)
        			        .setNeutralButton(aceptar,
        			                new DialogInterface.OnClickListener() {
        			                    public void onClick(DialogInterface dialog, int id) {
        			                        dialog.cancel();
        			                    }
        			                });
        			AlertDialog alert = builder.create();
        			alert.show();
        			
        		}
        		
        		else if(fin==2){
        			
        			this.ventanaFin.getText();
	       				 mensaje="Han Empatado";
	       				 titulo="Juego Acabado";
	       				 aceptar="Aceptar";
	       			
        			
        			AlertDialog.Builder builder = new AlertDialog.Builder(this);
        			builder.setMessage(mensaje)
        			        .setTitle(titulo)
        			        .setCancelable(false)
        			        .setNeutralButton(aceptar,
        			                new DialogInterface.OnClickListener() {
        			                    public void onClick(DialogInterface dialog, int id) {
        			                        dialog.cancel();
        			                    }
        			                });
        			AlertDialog alert = builder.create();
        			alert.show();
        			
        		}
        		
        	}
        	this.jugador=0;
        	
        }

	
	}
	//-----------------------------------------------------------	
	
	
	public void pulsax22(View view){
		 
		mp.start();
		
		if(this.jugador==0 && view.isClickable()){
			this.casilla22="X";
			this.B5.setBackgroundResource(R.drawable.cruz);
        	this.B5.setClickable(false);
        	
        	int fin= this.juegoAcabado();
        	if(fin!=-1){
        		if(fin==0){
        			
        			this.ventanaFin.getText();
        				 mensaje="Ganan las Cruces";
        				 titulo="Juego Acabado";
        				 aceptar="Aceptar";
        			
        			
        			AlertDialog.Builder builder = new AlertDialog.Builder(this);
        			builder.setMessage(mensaje)
        			        .setTitle(titulo)
        			        .setCancelable(false)
        			        .setNeutralButton(aceptar,
        			                new DialogInterface.OnClickListener() {
        			                    public void onClick(DialogInterface dialog, int id) {
        			                        dialog.cancel();
        			                    }
        			                });
        			AlertDialog alert = builder.create();
        			alert.show();
        			return;
        			
        		}
        		
        		else if(fin==2){
        			
        			this.ventanaFin.getText();
	       				 mensaje="Han Empatado";
	       				 titulo="Juego Acabado";
	       				 aceptar="Aceptar";
	       			
        			
        			AlertDialog.Builder builder = new AlertDialog.Builder(this);
        			builder.setMessage(mensaje)
        			        .setTitle(titulo)
        			        .setCancelable(false)
        			        .setNeutralButton(aceptar,
        			                new DialogInterface.OnClickListener() {
        			                    public void onClick(DialogInterface dialog, int id) {
        			                        dialog.cancel();
        			                    }
        			                });
        			AlertDialog alert = builder.create();
        			alert.show();
        			return;
        			
        		}
        		
        	}
        	this.jugador=1;
        	juegaCpu();
        	
	 }
        else if (this.jugador==1){
        	this.casilla22="0";
			this.B5.setBackgroundResource(R.drawable.circulo);
        	this.B5.setClickable(false);
        	int fin= this.juegoAcabado();
        	if(fin!=-1){
        		if(fin==1){
        			
        			this.ventanaFin.getText();
        				 mensaje="Ganan los Circulos";
        				 titulo="Juego Acabado";
        				 aceptar="Aceptar";
        			
        			
        			AlertDialog.Builder builder = new AlertDialog.Builder(this);
        			builder.setMessage(mensaje)
        			        .setTitle(titulo)
        			        .setCancelable(false)
        			        .setNeutralButton(aceptar,
        			                new DialogInterface.OnClickListener() {
        			                    public void onClick(DialogInterface dialog, int id) {
        			                        dialog.cancel();
        			                    }
        			                });
        			AlertDialog alert = builder.create();
        			alert.show();
        			
        		}
        		
        		else if(fin==2){
        			
        			this.ventanaFin.getText();
	       				 mensaje="Han Empatado";
	       				 titulo="Juego Acabado";
	       				 aceptar="Aceptar";
	       			
        			
        			AlertDialog.Builder builder = new AlertDialog.Builder(this);
        			builder.setMessage(mensaje)
        			        .setTitle(titulo)
        			        .setCancelable(false)
        			        .setNeutralButton(aceptar,
        			                new DialogInterface.OnClickListener() {
        			                    public void onClick(DialogInterface dialog, int id) {
        			                        dialog.cancel();
        			                    }
        			                });
        			AlertDialog alert = builder.create();
        			alert.show();
        			
        		}
        		
        	}
        	this.jugador=0;
        	
        }

	
	}
	//-----------------------------------------------------------	
	
	
	public void pulsax23(View view){
		 
		mp.start();
		
		if(this.jugador==0 && view.isClickable()){
			this.casilla23="X";
			this.C5.setBackgroundResource(R.drawable.cruz);
        	this.C5.setClickable(false);
        	
        	int fin= this.juegoAcabado();
        	if(fin!=-1){
        		if(fin==0){
        			
        			this.ventanaFin.getText();
        				 mensaje="Ganan las Cruces";
        				 titulo="Juego Acabado";
        				 aceptar="Aceptar";
        			
        			
        			AlertDialog.Builder builder = new AlertDialog.Builder(this);
        			builder.setMessage(mensaje)
        			        .setTitle(titulo)
        			        .setCancelable(false)
        			        .setNeutralButton(aceptar,
        			                new DialogInterface.OnClickListener() {
        			                    public void onClick(DialogInterface dialog, int id) {
        			                        dialog.cancel();
        			                    }
        			                });
        			AlertDialog alert = builder.create();
        			alert.show();
        			return;
        			
        		}
        		
        		else if(fin==2){
        			
        			this.ventanaFin.getText();
	       				 mensaje="Han Empatado";
	       				 titulo="Juego Acabado";
	       				 aceptar="Aceptar";
	       			
        			
        			AlertDialog.Builder builder = new AlertDialog.Builder(this);
        			builder.setMessage(mensaje)
        			        .setTitle(titulo)
        			        .setCancelable(false)
        			        .setNeutralButton(aceptar,
        			                new DialogInterface.OnClickListener() {
        			                    public void onClick(DialogInterface dialog, int id) {
        			                        dialog.cancel();
        			                    }
        			                });
        			AlertDialog alert = builder.create();
        			alert.show();
        			return;
        			
        		}
        		
        	}
        	this.jugador=1;
        	juegaCpu();
        	
	 }
        else if (this.jugador==1){
        	this.casilla23="0";
			this.C5.setBackgroundResource(R.drawable.circulo);
        	this.C5.setClickable(false);
        	int fin= this.juegoAcabado();
        	if(fin!=-1){
        		if(fin==1){
        			
        			this.ventanaFin.getText();
        				 mensaje="Ganan los Circulos";
        				 titulo="Juego Acabado";
        				 aceptar="Aceptar";
        			
        			
        			AlertDialog.Builder builder = new AlertDialog.Builder(this);
        			builder.setMessage(mensaje)
        			        .setTitle(titulo)
        			        .setCancelable(false)
        			        .setNeutralButton(aceptar,
        			                new DialogInterface.OnClickListener() {
        			                    public void onClick(DialogInterface dialog, int id) {
        			                        dialog.cancel();
        			                    }
        			                });
        			AlertDialog alert = builder.create();
        			alert.show();
        			
        		}
        		
        		else if(fin==2){
        			
        			this.ventanaFin.getText();
	       				 mensaje="Han Empatado";
	       				 titulo="Juego Acabado";
	       				 aceptar="Aceptar";
	       			
        			
        			AlertDialog.Builder builder = new AlertDialog.Builder(this);
        			builder.setMessage(mensaje)
        			        .setTitle(titulo)
        			        .setCancelable(false)
        			        .setNeutralButton(aceptar,
        			                new DialogInterface.OnClickListener() {
        			                    public void onClick(DialogInterface dialog, int id) {
        			                        dialog.cancel();
        			                    }
        			                });
        			AlertDialog alert = builder.create();
        			alert.show();
        			
        		}
        		
        	}
        	this.jugador=0;
        	
        }

	
	}
	//-----------------------------------------------------------	
	
	
	public void pulsax24(View view){
		 
		mp.start();
		
		if(this.jugador==0 && view.isClickable()){
			this.casilla24="X";
			this.D5.setBackgroundResource(R.drawable.cruz);
        	this.D5.setClickable(false);
        	
        	int fin= this.juegoAcabado();
        	if(fin!=-1){
        		if(fin==0){
        			
        			this.ventanaFin.getText();
        				 mensaje="Ganan las Cruces";
        				 titulo="Juego Acabado";
        				 aceptar="Aceptar";
        			
        			
        			AlertDialog.Builder builder = new AlertDialog.Builder(this);
        			builder.setMessage(mensaje)
        			        .setTitle(titulo)
        			        .setCancelable(false)
        			        .setNeutralButton(aceptar,
        			                new DialogInterface.OnClickListener() {
        			                    public void onClick(DialogInterface dialog, int id) {
        			                        dialog.cancel();
        			                    }
        			                });
        			AlertDialog alert = builder.create();
        			alert.show();
        			return;
        			
        		}
        		
        		else if(fin==2){
        			
        			this.ventanaFin.getText();
	       				 mensaje="Han Empatado";
	       				 titulo="Juego Acabado";
	       				 aceptar="Aceptar";
	       			
        			
        			AlertDialog.Builder builder = new AlertDialog.Builder(this);
        			builder.setMessage(mensaje)
        			        .setTitle(titulo)
        			        .setCancelable(false)
        			        .setNeutralButton(aceptar,
        			                new DialogInterface.OnClickListener() {
        			                    public void onClick(DialogInterface dialog, int id) {
        			                        dialog.cancel();
        			                    }
        			                });
        			AlertDialog alert = builder.create();
        			alert.show();
        			return;
        			
        		}
        		
        	}
        	this.jugador=1;
        	juegaCpu();
        	
	 }
        else if (this.jugador==1){
        	this.casilla24="0";
			this.D5.setBackgroundResource(R.drawable.circulo);
        	this.D5.setClickable(false);
        	int fin= this.juegoAcabado();
        	if(fin!=-1){
        		if(fin==1){
        			
        			this.ventanaFin.getText();
        				 mensaje="Ganan los Circulos";
        				 titulo="Juego Acabado";
        				 aceptar="Aceptar";
        			
        			
        			AlertDialog.Builder builder = new AlertDialog.Builder(this);
        			builder.setMessage(mensaje)
        			        .setTitle(titulo)
        			        .setCancelable(false)
        			        .setNeutralButton(aceptar,
        			                new DialogInterface.OnClickListener() {
        			                    public void onClick(DialogInterface dialog, int id) {
        			                        dialog.cancel();
        			                    }
        			                });
        			AlertDialog alert = builder.create();
        			alert.show();
        			
        		}
        		
        		else if(fin==2){
        			
        			this.ventanaFin.getText();
	       				 mensaje="Han Empatado";
	       				 titulo="Juego Acabado";
	       				 aceptar="Aceptar";
	       			
        			
        			AlertDialog.Builder builder = new AlertDialog.Builder(this);
        			builder.setMessage(mensaje)
        			        .setTitle(titulo)
        			        .setCancelable(false)
        			        .setNeutralButton(aceptar,
        			                new DialogInterface.OnClickListener() {
        			                    public void onClick(DialogInterface dialog, int id) {
        			                        dialog.cancel();
        			                    }
        			                });
        			AlertDialog alert = builder.create();
        			alert.show();
        			
        		}
        		
        	}
        	this.jugador=0;
        	
        }

	
	}
	//-----------------------------------------------------------	
	
	
	public void pulsax25(View view){
		 
		mp.start();
		
		if(this.jugador==0 && view.isClickable()){
			this.casilla25="X";
			this.E5.setBackgroundResource(R.drawable.cruz);
        	this.E5.setClickable(false);
        	
        	int fin= this.juegoAcabado();
        	if(fin!=-1){
        		if(fin==0){
        			
        			this.ventanaFin.getText();
        				 mensaje="Ganan las Cruces";
        				 titulo="Juego Acabado";
        				 aceptar="Aceptar";
        			
        			
        			AlertDialog.Builder builder = new AlertDialog.Builder(this);
        			builder.setMessage(mensaje)
        			        .setTitle(titulo)
        			        .setCancelable(false)
        			        .setNeutralButton(aceptar,
        			                new DialogInterface.OnClickListener() {
        			                    public void onClick(DialogInterface dialog, int id) {
        			                        dialog.cancel();
        			                    }
        			                });
        			AlertDialog alert = builder.create();
        			alert.show();
        			return;
        			
        		}
        		
        		else if(fin==2){
        			
        			this.ventanaFin.getText();
	       				 mensaje="Han Empatado";
	       				 titulo="Juego Acabado";
	       				 aceptar="Aceptar";
	       			
        			
        			AlertDialog.Builder builder = new AlertDialog.Builder(this);
        			builder.setMessage(mensaje)
        			        .setTitle(titulo)
        			        .setCancelable(false)
        			        .setNeutralButton(aceptar,
        			                new DialogInterface.OnClickListener() {
        			                    public void onClick(DialogInterface dialog, int id) {
        			                        dialog.cancel();
        			                    }
        			                });
        			AlertDialog alert = builder.create();
        			alert.show();
        			return;
        			
        		}
        		
        	}
        	this.jugador=1;
        	juegaCpu();
        	
	 }
        else if (this.jugador==1){
        	this.casilla25="0";
			this.E5.setBackgroundResource(R.drawable.circulo);
        	this.E5.setClickable(false);
        	int fin= this.juegoAcabado();
        	if(fin!=-1){
        		if(fin==1){
        			
        			this.ventanaFin.getText();
        				 mensaje="Ganan los Circulos";
        				 titulo="Juego Acabado";
        				 aceptar="Aceptar";
        			
        			
        			AlertDialog.Builder builder = new AlertDialog.Builder(this);
        			builder.setMessage(mensaje)
        			        .setTitle(titulo)
        			        .setCancelable(false)
        			        .setNeutralButton(aceptar,
        			                new DialogInterface.OnClickListener() {
        			                    public void onClick(DialogInterface dialog, int id) {
        			                        dialog.cancel();
        			                    }
        			                });
        			AlertDialog alert = builder.create();
        			alert.show();
        			
        		}
        		
        		else if(fin==2){
        			
        			this.ventanaFin.getText();
	       				 mensaje="Han Empatado";
	       				 titulo="Juego Acabado";
	       				 aceptar="Aceptar";
	       			
        			
        			AlertDialog.Builder builder = new AlertDialog.Builder(this);
        			builder.setMessage(mensaje)
        			        .setTitle(titulo)
        			        .setCancelable(false)
        			        .setNeutralButton(aceptar,
        			                new DialogInterface.OnClickListener() {
        			                    public void onClick(DialogInterface dialog, int id) {
        			                        dialog.cancel();
        			                    }
        			                });
        			AlertDialog alert = builder.create();
        			alert.show();
        			
        		}
        		
        	}
        	this.jugador=0;
        	
        }

	
	}
	public void pulsaxborrar(View view){
		
		mp.start();
		
		this.casilla1="-1";
		this.A1.setBackgroundResource(R.drawable.casilla_vacia);
		this.A1.setClickable(true);
		
		this.casilla2="-1";
		this.B1.setBackgroundResource(R.drawable.casilla_vacia);
		this.B1.setClickable(true);
        
		this.casilla3="-1";
        this.C1.setBackgroundResource(R.drawable.casilla_vacia);
        this.C1.setClickable(true);
        
    	this.casilla4="-1";
        this.D1.setBackgroundResource(R.drawable.casilla_vacia);
        this.D1.setClickable(true);
        
    	this.casilla5="-1";
        this.E1.setBackgroundResource(R.drawable.casilla_vacia);
        this.E1.setClickable(true);
        
        this.casilla6="-1";
        this.A2.setBackgroundResource(R.drawable.casilla_vacia);
        this.A2.setClickable(true);
        
        this.casilla7="-1";
        this.B2.setBackgroundResource(R.drawable.casilla_vacia);
        this.B2.setClickable(true);
        
        this.casilla8="-1";
        this.C2.setBackgroundResource(R.drawable.casilla_vacia);
        this.C2.setClickable(true);
        
        this.casilla9="-1";
        this.D2.setBackgroundResource(R.drawable.casilla_vacia);
        this.D2.setClickable(true);
        
        this.casilla10="-1";
        this.E2.setBackgroundResource(R.drawable.casilla_vacia);
        this.E2.setClickable(true);
        
        this.casilla11="-1";
        this.A3.setBackgroundResource(R.drawable.casilla_vacia);
        this.A3.setClickable(true);
        
        this.casilla12="-1";
        this.B3.setBackgroundResource(R.drawable.casilla_vacia);
        this.B3.setClickable(true);
        
        this.casilla13="-1";
        this.C3.setBackgroundResource(R.drawable.casilla_vacia);
        this.C3.setClickable(true);
        
        this.casilla14="-1";
        this.D3.setBackgroundResource(R.drawable.casilla_vacia);
        this.D3.setClickable(true);
        
        this.casilla15="-1";
        this.E3.setBackgroundResource(R.drawable.casilla_vacia);
        this.E3.setClickable(true);
        
        this.casilla16="-1";
        this.A4.setBackgroundResource(R.drawable.casilla_vacia);
        this.A4.setClickable(true);
        
        this.casilla17="-1";
        this.B4.setBackgroundResource(R.drawable.casilla_vacia);
        this.B4.setClickable(true);
        
        this.casilla18="-1";
        this.C4.setBackgroundResource(R.drawable.casilla_vacia);
        this.C4.setClickable(true);
        
        this.casilla19="-1";
        this.D4.setBackgroundResource(R.drawable.casilla_vacia);
        this.D4.setClickable(true);
        
        this.casilla20="-1";
        this.E4.setBackgroundResource(R.drawable.casilla_vacia);
        this.E4.setClickable(true);
        
        this.casilla21="-1";
        this.A5.setBackgroundResource(R.drawable.casilla_vacia);
        this.A5.setClickable(true);
        
        this.casilla22="-1";
        this.B5.setBackgroundResource(R.drawable.casilla_vacia);
        this.B5.setClickable(true);
        
        this.casilla23="-1";
        this.C5.setBackgroundResource(R.drawable.casilla_vacia);
        this.C5.setClickable(true);
        
        this.casilla24="-1";
        this.D5.setBackgroundResource(R.drawable.casilla_vacia);
        this.D5.setClickable(true);
        
        this.casilla25="-1";
        this.E5.setBackgroundResource(R.drawable.casilla_vacia);
        this.E5.setClickable(true);
             
        if(contador==0){
        	this.jugador=1;
        	juegaCpu();
        	contador=1;
        }
        else if (contador==1){
        	this.jugador=0;
        	contador=0;
        }
        
		
	} 
	
	public void fin(){
		
		
		this.A1.setClickable(false);
        
        this.B1.setClickable(false);
        
        this.C1.setClickable(false);
        
        this.D1.setClickable(false);
        
        this.E1.setClickable(false);
        
        this.A2.setClickable(false);
        
        this.B2.setClickable(false);
        
        this.C2.setClickable(false);
        
        this.D2.setClickable(false);
        
        this.E2.setClickable(false);
        
        this.A3.setClickable(false);
        
        this.B3.setClickable(false);
        
        this.C3.setClickable(false);
        
        this.D3.setClickable(false);
        
        this.E3.setClickable(false);
        
        this.A4.setClickable(false);
        
        this.B4.setClickable(false);
        
        this.C4.setClickable(false);
        
        this.D4.setClickable(false);
        
        this.E4.setClickable(false);
        
        this.A5.setClickable(false);
        
        this.B5.setClickable(false);
        
        this.C5.setClickable(false);
        
        this.D5.setClickable(false);
        
        this.E5.setClickable(false);
        
		
	}
	
	public int juegoAcabado(){

//		HORIZONTAL
		if(!this.A1.isClickable() && !this.B1.isClickable()  && !this.C1.isClickable() 
                && this.casilla1.equals(this.casilla2) && this.casilla1.equals(this.casilla3)){
			
			this.fin();
			return jugador;
		}
		if(!this.B1.isClickable() && !this.C1.isClickable()  && !this.D1.isClickable() 
                && this.casilla2.equals(this.casilla3) && this.casilla2.equals(this.casilla4)){
			
			this.fin();
			return jugador;
		}
		if(!this.C1.isClickable() && !this.D1.isClickable()  && !this.E1.isClickable() 
                && this.casilla3.equals(this.casilla4) && this.casilla3.equals(this.casilla5)){
			
			this.fin();
			return jugador;
		}
		if(!this.A2.isClickable() && !this.B2.isClickable()  && !this.C2.isClickable() 
                && this.casilla6.equals(this.casilla7) && this.casilla6.equals(this.casilla8)){
			
			this.fin();
			return jugador;
		}
		if(!this.B2.isClickable() && !this.C2.isClickable()  && !this.D2.isClickable() 
                && this.casilla7.equals(this.casilla8) && this.casilla7.equals(this.casilla9)){
			
			this.fin();
			return jugador;
		}
		if(!this.C2.isClickable() && !this.D2.isClickable()  && !this.E2.isClickable() 
                && this.casilla8.equals(this.casilla9) && this.casilla8.equals(this.casilla10)){
			
			this.fin();
			return jugador;
		}
		if(!this.A3.isClickable() && !this.B3.isClickable()  && !this.C3.isClickable() 
                && this.casilla11.equals(this.casilla12) && this.casilla11.equals(this.casilla13)){
			
			this.fin();
			return jugador;
		}
		if(!this.B3.isClickable() && !this.C3.isClickable()  && !this.D3.isClickable() 
                && this.casilla12.equals(this.casilla13) && this.casilla12.equals(this.casilla14)){
			
			this.fin();
			return jugador;
		}
		if(!this.C3.isClickable() && !this.D3.isClickable()  && !this.E3.isClickable() 
                && this.casilla13.equals(this.casilla14) && this.casilla13.equals(this.casilla15)){
			
			this.fin();
			return jugador;
		}
		if(!this.A4.isClickable() && !this.B4.isClickable()  && !this.C4.isClickable() 
                && this.casilla16.equals(this.casilla17) && this.casilla16.equals(this.casilla18)){
			
			this.fin();
			return jugador;
		}
		if(!this.B4.isClickable() && !this.C4.isClickable()  && !this.D4.isClickable() 
                && this.casilla17.equals(this.casilla18) && this.casilla17.equals(this.casilla19)){
			
			this.fin();
			return jugador;
		}
		if(!this.C4.isClickable() && !this.D4.isClickable()  && !this.E4.isClickable() 
                && this.casilla18.equals(this.casilla19) && this.casilla18.equals(this.casilla20)){
			
			this.fin();
			return jugador;
		}
		if(!this.A5.isClickable() && !this.B5.isClickable()  && !this.C5.isClickable() 
                && this.casilla21.equals(this.casilla22) && this.casilla21.equals(this.casilla23)){
			
			this.fin();
			return jugador;
		}
		if(!this.B5.isClickable() && !this.C5.isClickable()  && !this.D5.isClickable() 
                && this.casilla22.equals(this.casilla23) && this.casilla22.equals(this.casilla24)){
			
			this.fin();
			return jugador;
		}
		if(!this.C5.isClickable() && !this.D5.isClickable()  && !this.E5.isClickable() 
                && this.casilla23.equals(this.casilla24) && this.casilla23.equals(this.casilla25)){
			
			this.fin();
			return jugador;
		}
//		VERTICAL
		
		if(!this.A1.isClickable() && !this.A2.isClickable()  && !this.A3.isClickable() 
                && this.casilla1.equals(this.casilla6) && this.casilla1.equals(this.casilla11)){
			
			this.fin();
			return jugador;
		}
		if(!this.A2.isClickable() && !this.A3.isClickable()  && !this.A4.isClickable() 
                && this.casilla6.equals(this.casilla11) && this.casilla6.equals(this.casilla16)){
			
			this.fin();
			return jugador;
		}
		if(!this.A3.isClickable() && !this.A4.isClickable()  && !this.A5.isClickable() 
                && this.casilla11.equals(this.casilla16) && this.casilla11.equals(this.casilla21)){
			
			this.fin();
			return jugador;
		}
		if(!this.B1.isClickable() && !this.B2.isClickable()  && !this.B3.isClickable() 
                && this.casilla2.equals(this.casilla7) && this.casilla2.equals(this.casilla12)){
			
			this.fin();
			return jugador;
		}
		if(!this.B2.isClickable() && !this.B3.isClickable()  && !this.B4.isClickable() 
                && this.casilla7.equals(this.casilla12) && this.casilla7.equals(this.casilla17)){
			
			this.fin();
			return jugador;
		}
		if(!this.B3.isClickable() && !this.B4.isClickable()  && !this.B5.isClickable() 
                && this.casilla12.equals(this.casilla17) && this.casilla12.equals(this.casilla22)){
			
			this.fin();
			return jugador;
		}
		
		if(!this.C1.isClickable() && !this.C2.isClickable()  && !this.C3.isClickable() 
                && this.casilla3.equals(this.casilla8) && this.casilla3.equals(this.casilla13)){
			
			this.fin();
			return jugador;
		}
		if(!this.C2.isClickable() && !this.C3.isClickable()  && !this.C4.isClickable() 
                && this.casilla8.equals(this.casilla13) && this.casilla8.equals(this.casilla18)){
			
			this.fin();
			return jugador;
		}
		if(!this.C3.isClickable() && !this.C4.isClickable()  && !this.C5.isClickable() 
                && this.casilla13.equals(this.casilla18) && this.casilla13.equals(this.casilla23)){
			
			this.fin();
			return jugador;
		}
		if(!this.D1.isClickable() && !this.D2.isClickable()  && !this.D3.isClickable() 
                && this.casilla4.equals(this.casilla9) && this.casilla4.equals(this.casilla14)){
			
			this.fin();
			return jugador;
		}
		if(!this.D2.isClickable() && !this.D3.isClickable()  && !this.D4.isClickable() 
                && this.casilla9.equals(this.casilla14) && this.casilla9.equals(this.casilla19)){
			
			this.fin();
			return jugador;
		}
		if(!this.D3.isClickable() && !this.D4.isClickable()  && !this.D5.isClickable() 
                && this.casilla14.equals(this.casilla19) && this.casilla14.equals(this.casilla24)){
			
			this.fin();
			return jugador;
		}
		if(!this.E1.isClickable() && !this.E2.isClickable()  && !this.E3.isClickable() 
                && this.casilla5.equals(this.casilla10) && this.casilla5.equals(this.casilla15)){
			
			this.fin();
			return jugador;
		}
		if(!this.E2.isClickable() && !this.E3.isClickable()  && !this.E4.isClickable() 
                && this.casilla10.equals(this.casilla15) && this.casilla10.equals(this.casilla20)){
			
			this.fin();
			return jugador;
		}
		if(!this.E3.isClickable() && !this.E4.isClickable()  && !this.E5.isClickable() 
                && this.casilla15.equals(this.casilla20) && this.casilla15.equals(this.casilla25)){
			
			this.fin();
			return jugador;
		}
//		DIAGONALES \
		if(!this.A3.isClickable() && !this.B4.isClickable()  && !this.C5.isClickable() 
                && this.casilla11.equals(this.casilla17) && this.casilla11.equals(this.casilla23)){
			
			this.fin();
			return jugador;
		}
		if(!this.A2.isClickable() && !this.B3.isClickable()  && !this.C4.isClickable() 
                && this.casilla6.equals(this.casilla12) && this.casilla6.equals(this.casilla18)){
			
			this.fin();
			return jugador;
		}
		if(!this.B3.isClickable() && !this.C4.isClickable()  && !this.D5.isClickable() 
                && this.casilla12.equals(this.casilla18) && this.casilla12.equals(this.casilla24)){
			
			this.fin();
			return jugador;
		}
		if(!this.A1.isClickable() && !this.B2.isClickable()  && !this.C3.isClickable() 
                && this.casilla1.equals(this.casilla7) && this.casilla1.equals(this.casilla13)){
			
			this.fin();
			return jugador;
		}
		if(!this.B2.isClickable() && !this.C3.isClickable()  && !this.D4.isClickable() 
                && this.casilla7.equals(this.casilla13) && this.casilla7.equals(this.casilla19)){
			
			this.fin();
			return jugador;
		}
		if(!this.C3.isClickable() && !this.D4.isClickable()  && !this.E5.isClickable() 
                && this.casilla13.equals(this.casilla19) && this.casilla13.equals(this.casilla25)){
			
			this.fin();
			return jugador;
		}
		if(!this.B1.isClickable() && !this.C2.isClickable()  && !this.D3.isClickable() 
                && this.casilla2.equals(this.casilla8) && this.casilla2.equals(this.casilla14)){
			
			this.fin();
			return jugador;
		}
		if(!this.C2.isClickable() && !this.D3.isClickable()  && !this.E4.isClickable() 
                && this.casilla8.equals(this.casilla14) && this.casilla8.equals(this.casilla20)){
			
			this.fin();
			return jugador;
		}
		if(!this.C1.isClickable() && !this.D2.isClickable()  && !this.E3.isClickable() 
                && this.casilla3.equals(this.casilla9) && this.casilla3.equals(this.casilla15)){
			
			this.fin();
			return jugador;
		}
//		DIAGONALES /
		if(!this.A3.isClickable() && !this.B2.isClickable()  && !this.C1.isClickable() 
                && this.casilla11.equals(this.casilla7) && this.casilla11.equals(this.casilla3)){
			
			this.fin();
			return jugador;
		}
		if(!this.A4.isClickable() && !this.B3.isClickable()  && !this.C2.isClickable() 
                && this.casilla16.equals(this.casilla12) && this.casilla16.equals(this.casilla8)){
			
			this.fin();
			return jugador;
		}
		if(!this.B3.isClickable() && !this.C2.isClickable()  && !this.D1.isClickable() 
                && this.casilla12.equals(this.casilla8) && this.casilla12.equals(this.casilla4)){
			
			this.fin();
			return jugador;
		}
		if(!this.A5.isClickable() && !this.B4.isClickable()  && !this.C3.isClickable() 
                && this.casilla21.equals(this.casilla17) && this.casilla21.equals(this.casilla13)){
			
			this.fin();
			return jugador;
		}
		if(!this.B4.isClickable() && !this.C3.isClickable()  && !this.D2.isClickable() 
                && this.casilla17.equals(this.casilla13) && this.casilla17.equals(this.casilla9)){
			
			this.fin();
			return jugador;
		}
		if(!this.C3.isClickable() && !this.D2.isClickable()  && !this.E1.isClickable() 
                && this.casilla13.equals(this.casilla9) && this.casilla13.equals(this.casilla5)){
			
			this.fin();
			return jugador;
		}
		if(!this.B5.isClickable() && !this.C4.isClickable()  && !this.D3.isClickable() 
                && this.casilla22.equals(this.casilla18) && this.casilla22.equals(this.casilla14)){
			
			this.fin();
			return jugador;
		}
		if(!this.C4.isClickable() && !this.D3.isClickable()  && !this.E2.isClickable() 
                && this.casilla18.equals(this.casilla14) && this.casilla18.equals(this.casilla10)){
			
			this.fin();
			return jugador;
		}
		if(!this.C5.isClickable() && !this.D4.isClickable()  && !this.E3.isClickable() 
                && this.casilla23.equals(this.casilla19) && this.casilla23.equals(this.casilla15)){
			
			this.fin();
			return jugador;
		}
		return -1;//continua el juego
	
	}
	
	@Override
	public void onResume() {
		if(mp == null){
			mp = MediaPlayer.create(getBaseContext(), R.raw.click_casilla);
		}
		
		super.onResume();
	}
	
	@Override
	public void onStop() {
		mp.release();
		mp = null;
		
		super.onStop();
	}
	
	public String mejorCasilla(String jugador){
		

		
//		if(this.C3.isClickable()){
//			if ((casilla2.equals(jugador) && casilla3.equals(jugador)) ||
//					(casilla6.equals(jugador) && casilla11.equals(jugador)) ||
//					(casilla7.equals(jugador) && casilla13.equals(jugador))) {
//				return "casilla1";
//			}
//			
//		}

		
//		if(this.B1.isClickable()){
//			if ((casilla1.equals(jugador) && casilla3.equals(jugador)) ||
//					(casilla5.equals(jugador) && casilla8.equals(jugador))) {
//				return "casilla2";
//			}
//		}
//		if(this.C1.isClickable()){
//			if ((casilla1.equals(jugador) && casilla2.equals(jugador)) ||
//					(casilla8.equals(jugador) && casilla13.equals(jugador)) ||
//					(casilla4.equals(jugador) && casilla5.equals(jugador))) {
//				return "casilla3";
//			}
//		}
//		if(this.D1.isClickable()){
//			if ((casilla2.equals(jugador) && casilla3.equals(jugador)) ||
//					(casilla9.equals(jugador) && casilla14.equals(jugador)) ||
//					(casilla8.equals(jugador) && casilla12.equals(jugador))) {
//				return "casilla4";
//			}
//		}
//		if(this.E1.isClickable()){
//			if ((casilla3.equals(jugador) && casilla4.equals(jugador)) ||
//					(casilla9.equals(jugador) && casilla13.equals(jugador)) ||
//					(casilla10.equals(jugador) && casilla15.equals(jugador))) {
//				return "casilla5";
//			}
//		}
//		if(this.A2.isClickable()){
//			if ((casilla7.equals(jugador) && casilla8.equals(jugador)) ||
//					(casilla11.equals(jugador) && casilla16.equals(jugador)) ||
//					(casilla12.equals(jugador) && casilla18.equals(jugador))) {
//				return "casilla5";
//			}
//		}
//		if(this.B2.isClickable()){
//			
//			if ((casilla8.equals(jugador) && casilla9.equals(jugador)) ||
//					(casilla13.equals(jugador) && casilla19.equals(jugador))||
//					(casilla12.equals(jugador) && casilla17.equals(jugador))) {
//				return "casilla7";
//			}
//		}
//		if(this.C2.isClickable()){
//			
//			if ((casilla6.equals(jugador) && casilla7.equals(jugador)) ||
//					(casilla9.equals(jugador) && casilla10.equals(jugador)) ||
//					(casilla14.equals(jugador) && casilla20.equals(jugador))||
//					(casilla12.equals(jugador) && casilla16.equals(jugador))) {
//				return "casilla7";
//			}
//		}
//		if(this.D2.isClickable()){
//			
//			if ((casilla7.equals(jugador) && casilla8.equals(jugador)) ||
//					(casilla13.equals(jugador) && casilla17.equals(jugador))||
//					(casilla14.equals(jugador) && casilla19.equals(jugador))) {
//				return "casilla7";
//			}
//		}
//
//		if(this.E2.isClickable()){
//			
//			if ((casilla8.equals(jugador) && casilla9.equals(jugador)) ||
//					(casilla14.equals(jugador) && casilla18.equals(jugador))||
//					(casilla15.equals(jugador) && casilla20.equals(jugador))) {
//				return "casilla7";
//			}
//		}
//		if(this.A3.isClickable()){
//			if ((casilla1.equals(jugador) && casilla4.equals(jugador)) ||
//					(casilla8.equals(jugador) && casilla9.equals(jugador)) ||
//					(casilla5.equals(jugador) && casilla3.equals(jugador))) {
//				return "casilla11";
//			}
//		}
//		if(this.B3.isClickable()){
//			if ((casilla7.equals(jugador) && casilla9.equals(jugador)) ||
//					(casilla2.equals(jugador) && casilla5.equals(jugador))) {
//				return "casilla12";
//			}
//		}
//		if(this.C3.isClickable()){
//			if ((casilla3.equals(jugador) && casilla6.equals(jugador)) ||
//					(casilla1.equals(jugador) && casilla5.equals(jugador))||
//					(casilla8.equals(jugador) && casilla7.equals(jugador))) {
//				return "casilla13";
//			}
//		}
//		if(this.D3.isClickable()){
//			if ((casilla3.equals(jugador) && casilla6.equals(jugador)) ||
//					(casilla1.equals(jugador) && casilla5.equals(jugador))||
//					(casilla8.equals(jugador) && casilla7.equals(jugador))) {
//				return "casilla14";
//			}
//		}
//		if(this.E3.isClickable()){
//			if ((casilla3.equals(jugador) && casilla6.equals(jugador)) ||
//					(casilla1.equals(jugador) && casilla5.equals(jugador))||
//					(casilla8.equals(jugador) && casilla7.equals(jugador))) {
//				return "casilla15";
//			}
//		}
//		if(this.A4.isClickable()){
//			if ((casilla3.equals(jugador) && casilla6.equals(jugador)) ||
//					(casilla1.equals(jugador) && casilla5.equals(jugador))||
//					(casilla8.equals(jugador) && casilla7.equals(jugador))) {
//				return "casilla16";
//			}
//		}
//		if(this.B4.isClickable()){
//			if ((casilla3.equals(jugador) && casilla6.equals(jugador)) ||
//					(casilla1.equals(jugador) && casilla5.equals(jugador))||
//					(casilla8.equals(jugador) && casilla7.equals(jugador))) {
//				return "casilla17";
//			}
//		}
//		if(this.C4.isClickable()){
//			if ((casilla3.equals(jugador) && casilla6.equals(jugador)) ||
//					(casilla1.equals(jugador) && casilla5.equals(jugador))||
//					(casilla8.equals(jugador) && casilla7.equals(jugador))) {
//				return "casilla18";
//			}
//		}
//		if(this.D4.isClickable()){
//			if ((casilla3.equals(jugador) && casilla6.equals(jugador)) ||
//					(casilla1.equals(jugador) && casilla5.equals(jugador))||
//					(casilla8.equals(jugador) && casilla7.equals(jugador))) {
//				return "casilla19";
//			}
//		}
//		if(this.E4.isClickable()){
//			if ((casilla3.equals(jugador) && casilla6.equals(jugador)) ||
//					(casilla1.equals(jugador) && casilla5.equals(jugador))||
//					(casilla8.equals(jugador) && casilla7.equals(jugador))) {
//				return "casilla20";
//			}
//		}
//		if(this.A5.isClickable()){
//			if ((casilla3.equals(jugador) && casilla6.equals(jugador)) ||
//					(casilla1.equals(jugador) && casilla5.equals(jugador))||
//					(casilla8.equals(jugador) && casilla7.equals(jugador))) {
//				return "casilla21";
//			}
//		}
//		if(this.B5.isClickable()){
//			if ((casilla3.equals(jugador) && casilla6.equals(jugador)) ||
//					(casilla1.equals(jugador) && casilla5.equals(jugador))||
//					(casilla8.equals(jugador) && casilla7.equals(jugador))) {
//				return "casilla22";
//			}
//		}
//		if(this.C5.isClickable()){
//			if ((casilla3.equals(jugador) && casilla6.equals(jugador)) ||
//					(casilla1.equals(jugador) && casilla5.equals(jugador))||
//					(casilla8.equals(jugador) && casilla7.equals(jugador))) {
//				return "casilla23";
//			}
//		}
//		if(this.D5.isClickable()){
//			if ((casilla3.equals(jugador) && casilla6.equals(jugador)) ||
//					(casilla1.equals(jugador) && casilla5.equals(jugador))||
//					(casilla8.equals(jugador) && casilla7.equals(jugador))) {
//				return "casilla24";
//			}
//		}
//		if(this.E5.isClickable()){
//			if ((casilla3.equals(jugador) && casilla6.equals(jugador)) ||
//					(casilla1.equals(jugador) && casilla5.equals(jugador))||
//					(casilla8.equals(jugador) && casilla7.equals(jugador))) {
//				return "casilla25";
//			}
//		}
		
		return "-1";
	}
	
	public String casillaAleatoria(){
		
		List<Integer> casillasVacias = new ArrayList<Integer>();
		
		  if(this.A1.isClickable()){
				casillasVacias.add(1);
			}
		
		
			if(this.B1.isClickable()){
				casillasVacias.add(2);
			}
		
		
			if(this.C1.isClickable()){
				casillasVacias.add(3);
			}
			
			if(this.D1.isClickable()){
				casillasVacias.add(4);
			}
			
			if(this.E1.isClickable()){
				casillasVacias.add(5);
			}
		
		
			if(this.A2.isClickable()){
				casillasVacias.add(6);			
			}
		
		
			if(this.B2.isClickable()){
				casillasVacias.add(7);
			}

		
			if(this.C2.isClickable()){
				casillasVacias.add(8);
			}
			
			if(this.D2.isClickable()){
				casillasVacias.add(9);
			}
			
			if(this.E2.isClickable()){
				casillasVacias.add(10);
			}
		

			if(this.A3.isClickable()){
				casillasVacias.add(11);
			}
		
		
			if(this.B3.isClickable()){
				casillasVacias.add(12);
			}
		
		
			if(this.C3.isClickable()){
				casillasVacias.add(13);
			}
			
			if(this.D3.isClickable()){
				casillasVacias.add(14);
			}
			
			if(this.E3.isClickable()){
				casillasVacias.add(15);
			}
			
			if(this.A4.isClickable()){
				casillasVacias.add(16);
			}
			
			if(this.B4.isClickable()){
				casillasVacias.add(17);
			}
			
			if(this.C4.isClickable()){
				casillasVacias.add(18);
			}
			
			if(this.D4.isClickable()){
				casillasVacias.add(19);
			}
			
			if(this.E4.isClickable()){
				casillasVacias.add(20);
			}
			
			if(this.A5.isClickable()){
				casillasVacias.add(21);
			}
			
			if(this.B5.isClickable()){
				casillasVacias.add(22);
			}
			if(this.C5.isClickable()){
				casillasVacias.add(23);
			}
			if(this.D5.isClickable()){
				casillasVacias.add(24);
			}
			
			if(this.E5.isClickable()){
				casillasVacias.add(25);
			}
			int index = random.nextInt(casillasVacias.size());
			
			return "casilla"+casillasVacias.get(index);
  }
	
   public void juegaCpu(){
	   
	   String i=mejorCasilla("0");
	   
	   if(i.equals("-1")){
		   i=mejorCasilla("X");
		  
		   if(i.equals("-1")){
			   i=casillaAleatoria();
			   
		   }
	   }

	   if(i.equals("casilla2") && i.equals("casilla3")){
		   pulsax1(null);
	   }
	   else if(i.equals("casilla2")){
		   pulsax2(null);
	   }
	   else if(i.equals("casilla3")){
		   pulsax3(null);
	   }
	   else if(i.equals("casilla4")){
		   pulsax4(null);
	   }
	   else if(i.equals("casilla5")){
		   pulsax5(null);
	   }
	   else if(i.equals("casilla6")){
		   pulsax6(null);
	   }
	   else if(i.equals("casilla7")){
		   pulsax7(null);
	   }
	   else if(i.equals("casilla8")){
		   pulsax8(null);
	   }
	   else if(i.equals("casilla9")){
		   pulsax9(null);
	   }

	   else if(i.equals("casilla10")){
		   pulsax10(null);
	   }

	   else if(i.equals("casilla11")){
		   pulsax11(null);
	   }
	   
	   else if(i.equals("casilla12")){
		   pulsax12(null);
	   }
	   else if(i.equals("casilla13")){
		   pulsax13(null);
	   }
	   else if(i.equals("casilla14")){
		   pulsax14(null);
	   }
	   else if(i.equals("casilla15")){
		   pulsax15(null);
	   }
	   else if(i.equals("casilla16")){
		   pulsax16(null);
	   }
	   else if(i.equals("casilla17")){
		   pulsax17(null);
	   }
	   else if(i.equals("casilla18")){
		   pulsax18(null);
	   }
	   else if(i.equals("casilla19")){
		   pulsax19(null);
	   }
	   else if(i.equals("casilla20")){
		   pulsax20(null);
	   }
	   else if(i.equals("casilla21")){
		   pulsax21(null);
	   }
	   else if(i.equals("casilla22")){
		   pulsax22(null);
	   }
	   else if(i.equals("casilla23")){
		   pulsax23(null);
	   }
	   else if(i.equals("casilla24")){
		   pulsax24(null);
	   }
	   else if(i.equals("casilla25")){
		   pulsax25(null);
	   }
  
	   
   }

}




