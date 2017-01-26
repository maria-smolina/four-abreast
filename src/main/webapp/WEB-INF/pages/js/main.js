$(document).ready(function () {

    var classes = {
    };

    var constants = {

    };



    function initVars() {
    }

    function bindEvents() {
        $("table").on("click", "td", onFieldClick);
    }

    function init() {
        initVars();
        bindEvents();
    }


    /* Handlers */
    function onFieldClick() {
        var move = retrieveGameMove.call(this);

        $.ajax({
            method: 'POST',
            url: '/addGameMove',
            contentType: "application/json",
            data: JSON.stringify(move)
        });
    }

    /* Helpers */
    function retrieveGameMove() {
        var move = {
            gameId: 512,
            senderId: 1234,
            type: "WIN"
            // position: {
            //     row: this.dataset.row,
            //     column: this.dataset.column
            // }
        };
        return move;
    }

    init();

});