package in.eightfolds.datepickerdialog.util;

import android.app.DatePickerDialog;
import android.content.Context;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;


/**
 * Created by Manohar on 14/08/2017.
 */

public class EightFoldsDatePickerDialog extends DatePickerDialog {


    private DatePickerDialog datePickerDialog;
    private SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");

    @RequiresApi(api = Build.VERSION_CODES.N)
    public EightFoldsDatePickerDialog(@NonNull Context context) {
        super(context);
        datePickerDialog = new DatePickerDialog(context);

    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    public EightFoldsDatePickerDialog(@NonNull Context context, int themeResId) {
        super(context, themeResId);
        datePickerDialog = new DatePickerDialog(context, themeResId);
    }

    public EightFoldsDatePickerDialog(@NonNull Context context, @Nullable OnDateSetListener listener, int year, int month, int dayOfMonth) {
        super(context, listener, year, month, dayOfMonth);
        datePickerDialog = new DatePickerDialog(context, listener, year, month, dayOfMonth);

    }

    public EightFoldsDatePickerDialog(@NonNull Context context, int themeResId, @Nullable OnDateSetListener listener, int year, int monthOfYear, int dayOfMonth) {
        super(context, themeResId, listener, year, monthOfYear, dayOfMonth);
        datePickerDialog = new DatePickerDialog(context, themeResId, listener, year, monthOfYear, dayOfMonth);
    }

    public void show() {
        datePickerDialog.show();
    }


    public void setMinDate(int year, int month, int day) {

        String minDate = "" + day + "-" + getmonth(month) + "-" + year;
 
        try {
            datePickerDialog.getDatePicker().setMinDate(dateFormat.parse(minDate).getTime());
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

    public void setMaxDate(int year, int month, int day) {

        String maxDate = "" + day + "-" + getmonth(month) + "-" + year;
        try {
            datePickerDialog.getDatePicker().setMaxDate(dateFormat.parse(maxDate).getTime());
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

    public void setTodayAsMaxDate() {
        
        datePickerDialog.getDatePicker().setMaxDate(Calendar.getInstance().getTime().getTime());

    }

    public void setTodayAsMinDate() {
        
        datePickerDialog.getDatePicker().setMinDate(Calendar.getInstance().getTime().getTime());

    }


    private String getmonth(int month) {

        switch (month) {
            case 1:
                return "January";

            case 2:
                return "February";

            case 3:
                return "March";

            case 4:
                return "April";

            case 5:
                return "May";

            case 6:
                return "June";

            case 7:
                return "July";

            case 8:
                return "August";

            case 9:
                return "September";

            case 10:
                return "October";

            case 11:
                return "November";

            case 12:
                return "December";


        }
        return "January";

    }

}

