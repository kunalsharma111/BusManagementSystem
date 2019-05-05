function openformm() {
  document.getElementById("myformm").style.display = "block";
}

function closeformm() {
  document.getElementById("myformm").style.display = "none";
}

$(document).ready(() => {
        setTimeout(() => {
            var firstnameLength = $(".firstname").length;
            $($(".firstname").get()).each((i, e) => {
                $(e).delay(100 * (i - 1)).fadeIn(500);
                if(i >= firstnameLength - 1) {
                    $(e).animate({
                        "margin-right": "2px"
                    }, 500);
                    $(".info").delay(200 * i).fadeIn(1500);
                }
            });
        }, 100);
    });