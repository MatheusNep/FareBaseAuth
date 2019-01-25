package com.cursoandroid.autenticacaousuario.autenticacaousuario;

import android.support.annotation.NonNull;
import android.support.v4.database.DatabaseUtilsCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firebaseAuth = FirebaseAuth.getInstance();

        firebaseAuth.signOut();

       if (firebaseAuth.getCurrentUser() != null){
           Log.i("verificarUsuario", "Usuário está logado!");
       }else{
           Log.i("verificarUsuario", "Usuário não está logado!");

       }

        /*firebaseAuth.signInWithEmailAndPassword("matheus.cursos@hotmail.com", "matheus123")
                .addOnCompleteListener(MainActivity.this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()){
                            Log.i("siginIn", "Loguin com sucesso");

                        }else {
                            Log.i("siginIn", "Erro no loguin");

                        }
                    }
                });*/

        /*
        firebaseAuth.createUserWithEmailAndPassword("matheus.cursos@hotmail.com", "matheus123")
                .addOnCompleteListener(MainActivity.this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {

                        if (task.isSuccessful()){
                            Log.i("createUsusario", "Cadastro criado com sucesso");

                        }else {
                            Log.i("createUsuario", "Erro no cadastro");

                        }
                    }
                });*/
    }
}
