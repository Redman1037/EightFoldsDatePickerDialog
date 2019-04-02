package in.eightfolds.datepickerdialog.util;

import android.app.DatePickerDialog
import android.content.Context
import android.os.Build
import android.support.annotation.RequiresApi
import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.*

class EightFoldsDatePickerDialog : DatePickerDialog {


    private var datePickerDialog: DatePickerDialog? = null
    private val dateFormat = SimpleDateFormat("dd-MMM-yyyy")

    @RequiresApi(api = Build.VERSION_CODES.N)
    constructor(context: Context) : super(context) {
        datePickerDialog = DatePickerDialog(context)

    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    constructor(context: Context, themeResId: Int) : super(context, themeResId) {
        datePickerDialog = DatePickerDialog(context, themeResId)
    }

    constructor(context: Context, listener: DatePickerDialog.OnDateSetListener?, year: Int, month: Int, dayOfMonth: Int) : super(context, listener, year, month, dayOfMonth) {
        datePickerDialog = DatePickerDialog(context, listener, year, month, dayOfMonth)

    }

    constructor(context: Context, themeResId: Int, listener: DatePickerDialog.OnDateSetListener?, year: Int, monthOfYear: Int, dayOfMonth: Int) : super(context, themeResId, listener, year, monthOfYear, dayOfMonth) {
        datePickerDialog = DatePickerDialog(context, themeResId, listener, year, monthOfYear, dayOfMonth)
    }

    override fun show() {
        datePickerDialog!!.show()
    }


    fun setMinDate(year: Int, month: Int, day: Int) {

        val minDate = "" + day + "-" + getmonth(month) + "-" + year

        try {
            datePickerDialog!!.datePicker.minDate = dateFormat.parse(minDate).time
        } catch (e: ParseException) {
            e.printStackTrace()
        }

    }

    fun setMaxDate(year: Int, month: Int, day: Int) {

        val maxDate = "" + day + "-" + getmonth(month) + "-" + year
        try {
            datePickerDialog!!.datePicker.maxDate = dateFormat.parse(maxDate).time
        } catch (e: ParseException) {
            e.printStackTrace()
        }

    }

    fun setTodayAsMaxDate() {

        datePickerDialog!!.datePicker.maxDate = Calendar.getInstance().time.time + 1000

    }

    fun setTodayAsMinDate() {

        datePickerDialog!!.datePicker.minDate = Calendar.getInstance().time.time - 1000

    }


    private fun getmonth(month: Int): String {

        when (month) {
            1 -> return "January"

            2 -> return "February"

            3 -> return "March"

            4 -> return "April"

            5 -> return "May"

            6 -> return "June"

            7 -> return "July"

            8 -> return "August"

            9 -> return "September"

            10 -> return "October"

            11 -> return "November"

            12 -> return "December"
        }
        return "January"

    }

}

