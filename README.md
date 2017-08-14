# EightFoldsDatePickerDialog
Using this you can easily set minimum and maximum dates to a datepicker dialog

# Usage

Copy EightFoldsDatePickerDialog.java to your project

```java
EightFoldsDatePickerDialog datePickerDialog=new EightFoldsDatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
              //Do something with date
                Toast.makeText(this, "Year "+year+" month "+month+" day "+dayOfMonth, Toast.LENGTH_SHORT).show();
            }
        },year,month,day);   // give any  year , month , day values, this will be opened by default in dialog
        
        datePickerDialog.setMinDate(2000,12,28); //arguments are   year , month , date (use for setting custom mix date)
       // datePickerDialog.setTodayAsMinDate();   // sets today's date as min date
        datePickerDialog.setTodayAsMaxDate();    // sets today's date as max date
       // datePickerDialog.setMaxDate(2020,4,25); //arguments are   year , month , date (use for setting custom max date)
        datePickerDialog.show();

```
