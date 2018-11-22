package com.servidorbt;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ServidorBT extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "ServidorBT";
    // Declaramos una constante para lanzar los Intent de activacion de
    // Bluetooth
    private static final int REQUEST_ENABLE_BT = 1;
    private static final String ALERTA = "alerta";
    // Declaramos una variable privada para cada control de la actividad
    private Button btnEnviar;
    private Button btnBluetooth;
    private Button btnSalir;
    private EditText txtMensaje;
    private TextView tvMensaje;
    private TextView tvConexion;
    private BluetoothAdapter bAdapter; //Adapter para uso del Bluetooth
    private ServServidorBT servicio; //Servicio de mensajes de Bluetooth
    private BluetoothDevice ultimoDispositivo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_servidor_bt);
        // Invocamos el metodo de configuracion de nuestros controles
        configurarControles();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_servidor_bt, menu);
        return true;
    }
    @Override
    public void onClick(View view) {

    }
}
