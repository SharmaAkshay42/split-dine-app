

$(function() {



  /*
  send order btn disable, if all checkboxes are unchecked
  */

    var checkBoxes = $('tbody .myCheckBox');
      checkBoxes.change(function () {
      $('#send-order-btn').prop('disabled', checkBoxes.filter(':checked').length < 1);
  });
  checkBoxes.change();

}); /* End Strict Function */