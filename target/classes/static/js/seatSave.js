// Avoid scoping issues by encapsulating code inside anonymous function
(function() {
    // variable to store our current state
    var cbstate;
    
    // bind to the onload event
    window.addEventListener('load', function() {
      // Get the current state from localstorage -- State is stored as a JSON string
      cbstate = JSON.parse(localStorage['CBState'] || '{}');
    
      // Loop through state array and restore checked state for matching elements
      for(var i in cbstate) {
        var el = document.querySelector('input[name="' + i + '"]');
        if (el) el.checked = true;
      }
    
      // Get all checkboxes that you want to monitor state for
      var cb = document.getElementsByClassName('save-cb-state-select');
    
      // Loop through results and ...
      for(var i = 0; i < cb.length; i++) {
    
        //bind click event handler
        cb[i].addEventListener('click', function(evt) {
          // If box is checked then save to state
          if (this.checked) {
            cbstate[this.name] = true;
          }
      
      // Otherwise remove from state
          else if (cbstate[this.name]) {
            delete cbstate[this.name];
          }
      
      // Persist state through refresh and page changes
          localStorage.CBState = JSON.stringify(cbstate);
        });
      }
    });
  })();
  

  function RowLabel(){
    const row_labels = [DD, CC, BB, AA, Z];
    let x = document.createElement("label");
    for (let i = 0; i < row_labels.length; i++){
      x[i].value = row_labels[i];
    }
    document.getElementsById("test_aisle1").innerHTML = x;
  }

  /*Notification Code*/
  function getSelectedCheckboxValues(name) {
    const checkboxes = document.querySelectorAll(`input[name="${name}"]:checked`);
    let values = [];
    checkboxes.forEach((checkbox) => {
        values.push(checkbox.value);
    });
    return values;
  }
  
  const btn = document.querySelector('#btn');
  btn.addEventListener('click', (event) => {
    alert(getSelectedCheckboxValues('seat[]'));
  });