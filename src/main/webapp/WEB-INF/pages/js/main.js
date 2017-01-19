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
            id: 1,
            gameId: 1,
            userId: 1,
            // position: {
            //     row: this.dataset.row,
            //     column: this.dataset.column
            // }
        };
        return move;
    }

    init();

});