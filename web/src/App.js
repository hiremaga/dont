import React, {Component} from 'react';
import './App.css';
import {DefaultButton} from 'pivotal-ui/react/buttons';
import {Input} from 'pivotal-ui/react/inputs';
import {BaseModal, ModalBody, ModalFooter} from 'pivotal-ui/react/modals';

class App extends Component {
    constructor(props) {
        super(props);
        this.state = {modalOpen: false};
    }

    render() {
        return (
            <div>
                <DefaultButton onClick={() => this.setState({modalOpen: true})}> Open Stateless Modal </DefaultButton>
                <BaseModal acquireFocus={false} title='What a Header!' className='optional-custom-class'
                           show={this.state.modalOpen} onHide={() => this.setState({modalOpen: false})}> <ModalBody>
                    <p>Text in a body</p><Input autoFocus placeholder="Tell me your darkest secrets"/></ModalBody>
                    <ModalFooter>
                        <DefaultButton onClick={() => this.setState({modalOpen: false})}> Close </DefaultButton>
                    </ModalFooter>
                </BaseModal>
            </div>
        );
    }
}

export default App;
