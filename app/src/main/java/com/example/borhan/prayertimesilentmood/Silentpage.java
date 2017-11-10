package com.example.borhan.prayertimesilentmood;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

public class Silentpage extends AppCompatActivity {
    TextView fromTime;
    TextView toTime;
    TextView fromTimez;
    TextView toTimez;
    TextView fromTimea;
    TextView toTimea;
    TextView fromTimem;
    TextView toTimem;
    TextView fromTimei;
    TextView toTimei;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_silentpage);
        fromTime= (TextView) findViewById(R.id.fromTime);
        toTime= (TextView) findViewById(R.id.toTime);
        fromTimez= (TextView) findViewById(R.id.fromTimez);
        toTimez= (TextView) findViewById(R.id.toTimez);
        fromTimea= (TextView) findViewById(R.id.fromTimea);
        toTimea= (TextView) findViewById(R.id.toTimea);
        fromTimem= (TextView) findViewById(R.id.fromTimem);
        toTimem= (TextView) findViewById(R.id.toTimem);
        fromTimei= (TextView) findViewById(R.id.fromTimei);
        toTimei= (TextView) findViewById(R.id.toTimei);
        fromTime.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
             //   // TODO Auto-generated method stub
                Calendar mcurrentTime = Calendar.getInstance();
                int hour = mcurrentTime.get(Calendar.HOUR_OF_DAY);
                int minute = mcurrentTime.get(Calendar.MINUTE);
                TimePickerDialog mTimePicker;
                mTimePicker = new TimePickerDialog(Silentpage.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int selectedHour, int selectedMinute) {
                        if(selectedHour>12)
                        {
                            fromTime.setText( selectedHour + ":" + selectedMinute+"PM");
                        }
                        else
                        {
                            fromTime.setText( selectedHour + ":" + selectedMinute+"AM");
                        }

                    }
                }, hour, minute, false);//Yes 24 hour time
                mTimePicker.setTitle("Select Time");
                mTimePicker.show();

            }
        });



        toTime.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //   // TODO Auto-generated method stub
                Calendar mcurrentTime = Calendar.getInstance();
                int hour = mcurrentTime.get(Calendar.HOUR_OF_DAY);
                int minute = mcurrentTime.get(Calendar.MINUTE);
                TimePickerDialog mTimePicker;
                mTimePicker = new TimePickerDialog(Silentpage.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int selectedHour, int selectedMinute) {
                        if(selectedHour>12)
                        {
                            toTime.setText( selectedHour + ":" + selectedMinute+"PM");
                        }
                        else
                        {
                            toTime.setText( selectedHour + ":" + selectedMinute+"AM");
                        }

                    }
                }, hour, minute, false);//Yes 24 hour time
                mTimePicker.setTitle("Select Time");
                mTimePicker.show();

            }
        });


        fromTimez.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //   // TODO Auto-generated method stub
                Calendar mcurrentTime = Calendar.getInstance();
                int hour = mcurrentTime.get(Calendar.HOUR_OF_DAY);
                int minute = mcurrentTime.get(Calendar.MINUTE);
                TimePickerDialog mTimePicker;
                mTimePicker = new TimePickerDialog(Silentpage.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int selectedHour, int selectedMinute) {
                        if(selectedHour>12)
                        {
                            fromTimez.setText( selectedHour + ":" + selectedMinute+"PM");
                        }
                        else
                        {
                            fromTimez.setText( selectedHour + ":" + selectedMinute+"AM");
                        }

                    }
                }, hour, minute, false);//Yes 24 hour time
                mTimePicker.setTitle("Select Time");
                mTimePicker.show();
                setAlarm(mcurrentTime.getTimeInMillis());

            }
        });


        toTimez.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //   // TODO Auto-generated method stub
                Calendar mcurrentTime = Calendar.getInstance();
                int hour = mcurrentTime.get(Calendar.HOUR_OF_DAY);
                int minute = mcurrentTime.get(Calendar.MINUTE);
                TimePickerDialog mTimePicker;
                mTimePicker = new TimePickerDialog(Silentpage.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int selectedHour, int selectedMinute) {
                        if(selectedHour>12)
                        {
                            toTimez.setText( selectedHour + ":" + selectedMinute+"PM");
                        }
                        else
                        {
                            toTimez.setText( selectedHour + ":" + selectedMinute+"AM");
                        }

                    }
                }, hour, minute, false);//Yes 24 hour time
                mTimePicker.setTitle("Select Time");
                mTimePicker.show();

            }
        });


        fromTimea.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //   // TODO Auto-generated method stub
                Calendar mcurrentTime = Calendar.getInstance();
                int hour = mcurrentTime.get(Calendar.HOUR_OF_DAY);
                int minute = mcurrentTime.get(Calendar.MINUTE);
                TimePickerDialog mTimePicker;
                mTimePicker = new TimePickerDialog(Silentpage.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int selectedHour, int selectedMinute) {
                        if(selectedHour>12)
                        {
                            fromTimea.setText( selectedHour + ":" + selectedMinute+"PM");
                        }
                        else
                        {
                            fromTimea.setText( selectedHour + ":" + selectedMinute+"AM");
                        }

                    }
                }, hour, minute, false);//Yes 24 hour time
                mTimePicker.setTitle("Select Time");
                mTimePicker.show();

            }
        });



        toTimea.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //   // TODO Auto-generated method stub
                Calendar mcurrentTime = Calendar.getInstance();
                int hour = mcurrentTime.get(Calendar.HOUR_OF_DAY);
                int minute = mcurrentTime.get(Calendar.MINUTE);
                TimePickerDialog mTimePicker;
                mTimePicker = new TimePickerDialog(Silentpage.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int selectedHour, int selectedMinute) {
                        if(selectedHour>12)
                        {
                            toTimea.setText( selectedHour + ":" + selectedMinute+"PM");
                        }
                        else
                        {
                            toTimea.setText( selectedHour + ":" + selectedMinute+"AM");
                        }

                    }
                }, hour, minute, false);//Yes 24 hour time
                mTimePicker.setTitle("Select Time");
                mTimePicker.show();

            }
        });



        fromTimem.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //   // TODO Auto-generated method stub
                Calendar mcurrentTime = Calendar.getInstance();
                int hour = mcurrentTime.get(Calendar.HOUR_OF_DAY);
                int minute = mcurrentTime.get(Calendar.MINUTE);
                TimePickerDialog mTimePicker;
                mTimePicker = new TimePickerDialog(Silentpage.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int selectedHour, int selectedMinute) {
                        if(selectedHour>12)
                        {
                            fromTimem.setText( selectedHour + ":" + selectedMinute+"PM");
                        }
                        else
                        {
                            fromTimem.setText( selectedHour + ":" + selectedMinute+"AM");
                        }

                    }
                }, hour, minute, false);//Yes 24 hour time
                mTimePicker.setTitle("Select Time");
                mTimePicker.show();

            }
        });



        toTimem.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //   // TODO Auto-generated method stub
                Calendar mcurrentTime = Calendar.getInstance();
                int hour = mcurrentTime.get(Calendar.HOUR_OF_DAY);
                int minute = mcurrentTime.get(Calendar.MINUTE);
                TimePickerDialog mTimePicker;
                mTimePicker = new TimePickerDialog(Silentpage.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int selectedHour, int selectedMinute) {
                        if(selectedHour>12)
                        {
                            toTimem.setText( selectedHour + ":" + selectedMinute+"PM");
                        }
                        else
                        {
                            toTimem.setText( selectedHour + ":" + selectedMinute+"AM");
                        }

                    }
                }, hour, minute, false);//Yes 24 hour time
                mTimePicker.setTitle("Select Time");
                mTimePicker.show();

            }
        });



        fromTimei.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //   // TODO Auto-generated method stub
                Calendar mcurrentTime = Calendar.getInstance();
                int hour = mcurrentTime.get(Calendar.HOUR_OF_DAY);
                int minute = mcurrentTime.get(Calendar.MINUTE);
                TimePickerDialog mTimePicker;
                mTimePicker = new TimePickerDialog(Silentpage.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int selectedHour, int selectedMinute) {
                        if(selectedHour>12)
                        {
                            fromTimei.setText( selectedHour + ":" + selectedMinute+"PM");
                        }
                        else
                        {
                            fromTimei.setText( selectedHour + ":" + selectedMinute+"AM");
                        }

                    }
                }, hour, minute, false);//Yes 24 hour time
                mTimePicker.setTitle("Select Time");
                mTimePicker.show();

            }
        });



        toTimei.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                //   // TODO Auto-generated method stub
                Calendar mcurrentTime = Calendar.getInstance();
                int hour = mcurrentTime.get(Calendar.HOUR_OF_DAY);
                int minute = mcurrentTime.get(Calendar.MINUTE);
                TimePickerDialog mTimePicker;
                mTimePicker = new TimePickerDialog(Silentpage.this, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int selectedHour, int selectedMinute) {
                        if(selectedHour>12)
                        {
                            toTimei.setText( selectedHour + ":" + selectedMinute+"PM");
                        }
                        else
                        {
                            toTimei.setText( selectedHour + ":" + selectedMinute+"AM");
                        }

                    }
                }, hour, minute, false);//Yes 24 hour time
                mTimePicker.setTitle("Select Time");
                mTimePicker.show();

            }
        });










    }

    private void setAlarm(long timeInMillis) {
        AlarmManager alarmManager=(AlarmManager) getSystemService(Context.ALARM_SERVICE);
        Intent intent=new Intent(this,MyAlarm.class);

        PendingIntent pendingIntent=PendingIntent.getBroadcast(this,0,intent,0);
        Toast.makeText(this,"alarm is set",Toast.LENGTH_LONG).show();
    }

    public void timepicker(View view) {

    }
}
