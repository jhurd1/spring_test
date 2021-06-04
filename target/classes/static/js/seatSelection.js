/*manipulate the seat color and quantity*/

/*********************************
 * DATA MEMBERS
 *********************************/
var selectedObject = 
    document.documentElement.style.setProperty('.seatSelect', 'yellow');
let range = new Range();
var start = document.getElementById("start").nodeValue;
var end = document.getElementById("end").nodeValue;

/*********************************
 * SELECT SEATS IN DUPLICATE
 * selects seats according to 
 * user mouse or keyboard input.
 *********************************/
function selectSeats(selectedObject)
{
    let seatQuantity = 0;
    for (let i = 0; i < seatQuantity.options.length; i++)
    {
        if (selectedObject.options[i].selected)
        {
            seatQuantity++;
            range.setStart(input, start); //input represents the html object
        } else 
        {
            seatQuantity++;
            range.setEnd(input, end);
        }
    }
}