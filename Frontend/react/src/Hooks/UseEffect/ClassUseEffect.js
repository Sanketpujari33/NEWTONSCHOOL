import React, { Component } from 'react';

class ClassUseEffect extends Component {
    state={isOnline: null};
    componentDidMount(){
        ChatAPI.subscribeToFriendStatus(
            this.props.friend.id,
            this.handleStatusChange
        );
    }
    componentWillUnmount(){
        ChatAPI.unsubscribeFromFriendStatus(
            this.props.friend.id,
            this.handleStatusChange
        );
    }
    componentDidUpdate(prevProps){
        if(this.props.friend.id!==prevProps.id){
            ChatAPI.unsubscribeFromFriendStatus(
            prevProps.friend.id,
            this.handleStatusChange
            );
            ChatAPI.subscribeToFriendStatus(
                this.props.friend.id,
                this.handleStatusChange
            );
        }
    }
    handleStatusChange= state =>{
        this.setState({
            isOnline: state.isOnline
        });
    }
    render() {
        if(this.state.isOnline === null){
            return 'Loading.....'
        }
        return this.state.isOnline ? 'Online' : 'Offline';
    }
}

export default ClassUseEffect;
