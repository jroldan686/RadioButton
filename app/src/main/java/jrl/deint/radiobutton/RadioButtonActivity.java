package jrl.deint.radiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;

/**
 * Clase de ejemplo de cómo funciona RqadioButton y RadioGroup
 * @author Jesús Roldán López
 */
public class RadioButtonActivity extends AppCompatActivity {

    private View constraintParticular;
    private View constraintEmpresa;
    private RadioGroup rdgCliente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button);

        constraintParticular=findViewById(R.id.constraintParticular);
        constraintEmpresa=findViewById(R.id.constraintEmpresa);
        rdgCliente=findViewById(R.id.rdgCliente);
        rdgCliente.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int id) {
                switch (id) {
                    case R.id.rdbEmpresa:
                        viewParticular(false);
                        break;
                    case R.id.rdbParticular:
                        viewParticular(true);
                        break;
                }
            }
        });
    }

    /**
     * Método que gestiona el evento onClick en los componentes RadioButton de la interfaz
     * @param view
     */
/*
    public void onRadioButtonClicked(View view) {
        switch (view.getId()) {
            case R.id.rdbParticular:
                viewParticular(true);
                break;
            case R.id.rdbEmpresa:
                viewParticular(false);
                break;
        }
    }
*/
    /**
     * Método que indica qué ConstraintLayout ha de estar visible según la opción seleccionada.
     * @param b
     */
    private void viewParticular(boolean b) {
        constraintParticular.setVisibility(b?View.VISIBLE:View.GONE);
        constraintEmpresa.setVisibility(b?View.GONE:View.VISIBLE);
    }
}
