# EightFoldsDatePickerDialog
Using this you can easily set minimum and maximum dates to a datepicker dialog

# Usage

Copy EightFoldsDatePickerDialog.java to your project

```java
 
        val calendar = Calendar.getInstance()
        val datePickerDialog = EightFoldsDatePickerDialog(
            this,
            object : DatePickerDialog.OnDateSetListener {
                override fun onDateSet(view: DatePicker, year: Int, month: Int, dayOfMonth: Int) {

                    val date = "$dayOfMonth/$month/$year"
                   
                }
            },
            calendar.get(Calendar.YEAR),
            calendar.get(Calendar.MONTH),
            calendar.get(Calendar.DATE)
        )  

        datePickerDialog.setMinDate(2017,8,7); //arguments are   year , month , date (use for setting custom mix date)
        datePickerDialog.setMaxDate(2017,8,25);  //arguments are   year , month , date (use for setting custom max date)
       
     //   datePickerDialog.setTodayAsMinDate();   // sets today's date as min date
     //   datePickerDialog.setTodayAsMaxDate();    // sets today's date as max date

        datePickerDialog.show()

```
# Result

<p align="center">
<img src="https://user-images.githubusercontent.com/22935835/29265746-ccc8cbe4-80ff-11e7-8064-b478070c0de7.PNG" width="350"/>
</p>


