import React from 'react'

function Home(props) {
    return (
        <div>
            <h1>Home Component</h1>
            <div className="cart-wrapper">
                <div className="img-wrapper item">
                    <img src="https://imgs.search.brave.com/celjOlRG_rx_M28MLu2iuvSASzS2BEWYS_rPrul_EpY/rs:fit:1200:1200:1/g:ce/aHR0cDovL3B1cmVw/bmcuY29tL3B1Ymxp/Yy91cGxvYWRzL2xh/cmdlL3B1cmVwbmcu/Y29tLWlwaG9uZS14/aXBob25lLXhhcHBs/ZXNjcmVlbi0yMTUz/MDYxNzU2NWF0aXV0/LnBuZw" />
                </div>
                <div className="text-wrapper item">
                    <span>
                        I-Phone
                    </span>
                    <span>
                        Price: $1000.00
                    </span>
                </div>
                <div className="btn-wrapper item">
                    <button
                        onClick={
                            () => { props.addToCartHandler({ pice: 1000, name: 'i phone 11' }) }
                        }>
                        Add To Cart</button>
                        <button className='remove-cart-btn'
                        onClick={
                            () => { props.removeToCartHandler()}
                        }>
                        Remove To Cart</button>
                </div>
            </div>
        </div>
    )
}
export default Home